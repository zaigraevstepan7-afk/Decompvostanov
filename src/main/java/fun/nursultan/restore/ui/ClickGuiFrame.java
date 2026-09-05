// Java 21, restored Nursultan click GUI (cards / bind / dots)
package fun.nursultan.restore.ui;

import fun.nursultan.restore.catalog.Catalog;
import fun.nursultan.restore.catalog.ModuleDef;
import fun.nursultan.restore.state.ClientState;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public final class ClickGuiFrame extends JFrame implements ModuleCard.Listener {
    public static final String[] TABS = {"modules", "hud", "autobuy", "accounts", "courses", "classes"};

    private final Catalog catalog;
    private final ClientState state;
    private final Path dataDir;
    private final CardLayout cards = new CardLayout();
    private final JPanel cardHost = new JPanel(cards);
    private final JLabel status = new JLabel();
    private String category = "combat";
    private String tab = "modules";
    private JPanel moduleList;
    private JTextField search;
    private SettingsDrawer settingsDrawer;
    private JPanel sidebar;

    public ClickGuiFrame(Catalog catalog, Path dataDir) {
        super("Nursultan");
        this.catalog = catalog;
        this.dataDir = dataDir;
        this.state = new ClientState(catalog, dataDir);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1120, 700));
        setSize(1180, 740);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Theme.BG);
        setLayout(new BorderLayout());
        add(buildSidebar(), BorderLayout.WEST);
        add(buildCenter(), BorderLayout.CENTER);
        state.addListener(() -> {
            refreshStatus();
            if ("modules".equals(tab)) {
                refreshModules(search.getText());
            }
        });
        refreshModules("");
        refreshStatus();
    }

    public ClientState state() {
        return state;
    }

    public Catalog catalog() {
        return catalog;
    }

    public void showTab(String id) {
        tab = id;
        cards.show(cardHost, id);
        paintSidebar();
        refreshStatus();
    }

    public void showCategory(String id) {
        category = id;
        if (!"modules".equals(tab)) {
            showTab("modules");
        }
        if (search != null) {
            search.setText("");
        }
        refreshModules("");
        paintSidebar();
    }

    @Override
    public void settings(ModuleDef module) {
        settingsDrawer.show(module);
    }

    @Override
    public void bind(ModuleDef module) {
        String key = JOptionPane.showInputDialog(this, "bind for " + module.name, state.bind(module.id));
        if (key != null) {
            state.setBind(module.id, key.trim().toUpperCase());
            refreshModules(search.getText());
        }
    }

    @Override
    public void toggled(ModuleDef module) {
        refreshStatus();
    }

    private JComponent buildSidebar() {
        sidebar = new JPanel();
        sidebar.setBackground(Theme.PANEL);
        sidebar.setPreferredSize(new Dimension(168, 800));
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBorder(new EmptyBorder(22, 14, 18, 14));
        JLabel mark = new JLabel("NURSULTAN");
        mark.setForeground(Theme.ACCENT);
        mark.setFont(Theme.ui(16, Font.BOLD));
        mark.setAlignmentX(Component.LEFT_ALIGNMENT);
        sidebar.add(mark);
        sidebar.add(Box.createVerticalStrut(22));
        paintSidebar();
        return sidebar;
    }

    private void paintSidebar() {
        if (sidebar == null) {
            return;
        }
        sidebar.removeAll();
        JLabel mark = new JLabel("NURSULTAN");
        mark.setForeground(Theme.ACCENT);
        mark.setFont(Theme.ui(16, Font.BOLD));
        mark.setAlignmentX(Component.LEFT_ALIGNMENT);
        sidebar.add(mark);
        sidebar.add(Box.createVerticalStrut(20));
        for (String cat : catalog.categories) {
            sidebar.add(nav(cat, cat.equals(category) && "modules".equals(tab), () -> showCategory(cat)));
            sidebar.add(Box.createVerticalStrut(4));
        }
        sidebar.add(Box.createVerticalStrut(14));
        for (String extra : new String[] {"hud", "autobuy", "accounts", "courses", "classes"}) {
            sidebar.add(nav(extra, extra.equals(tab), () -> showTab(extra)));
            sidebar.add(Box.createVerticalStrut(4));
        }
        sidebar.add(Box.createVerticalGlue());
        JLabel stats = new JLabel("<html>" + catalog.classCount + " classes<br>" + catalog.modules.size()
                + " modules<br>" + catalog.methodCount() + " methods</html>");
        stats.setForeground(Theme.MUTED);
        stats.setFont(Theme.ui(11, Font.PLAIN));
        stats.setAlignmentX(Component.LEFT_ALIGNMENT);
        sidebar.add(stats);
        sidebar.revalidate();
        sidebar.repaint();
    }

    private JButton nav(String label, boolean selected, Runnable action) {
        JButton button = new JButton(label);
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
        button.setBackground(selected ? Theme.PANEL_ALT : Theme.PANEL);
        button.setForeground(selected ? Theme.TEXT : Theme.MUTED);
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, selected ? 3 : 0, 0, 0, Theme.ACCENT),
                BorderFactory.createEmptyBorder(6, selected ? 9 : 12, 6, 10)));
        button.setFocusPainted(false);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.addActionListener(e -> action.run());
        return button;
    }

    private JComponent buildCenter() {
        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(Theme.BG);
        root.add(buildTop(), BorderLayout.NORTH);
        cardHost.setBackground(Theme.BG);
        cardHost.add(buildModulesPage(), "modules");
        cardHost.add(new HudPanel(catalog, state), "hud");
        cardHost.add(new AutoBuyPanel(catalog, state), "autobuy");
        cardHost.add(new AccountsPanel(), "accounts");
        cardHost.add(new CoursesPanel(this, dataDir.resolve("courses")), "courses");
        cardHost.add(new ClassBrowser(catalog), "classes");
        root.add(cardHost, BorderLayout.CENTER);
        status.setForeground(Theme.MUTED);
        status.setBorder(new EmptyBorder(8, 18, 10, 18));
        root.add(status, BorderLayout.SOUTH);
        return root;
    }

    private JComponent buildTop() {
        JPanel top = new JPanel(new BorderLayout());
        top.setBackground(Theme.BG);
        top.setBorder(new EmptyBorder(16, 18, 10, 18));
        JLabel title = new JLabel("меню");
        title.setForeground(Theme.TEXT);
        title.setFont(Theme.ui(18, Font.BOLD));
        search = new JTextField();
        search.setBackground(Theme.PANEL_ALT);
        search.setForeground(Theme.TEXT);
        search.setCaretColor(Theme.TEXT);
        search.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Theme.STROKE), new EmptyBorder(7, 12, 7, 12)));
        search.setPreferredSize(new Dimension(260, 34));
        search.putClientProperty("JTextField.placeholderText", "search");
        search.getDocument().addDocumentListener(new SimpleDocumentListener(() -> refreshModules(search.getText())));
        JPanel right = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        right.setOpaque(false);
        right.add(search);
        top.add(title, BorderLayout.WEST);
        top.add(right, BorderLayout.EAST);
        return top;
    }

    private JComponent buildModulesPage() {
        JPanel page = new JPanel(new BorderLayout(12, 0));
        page.setBackground(Theme.BG);
        page.setBorder(new EmptyBorder(0, 18, 8, 18));
        moduleList = new JPanel();
        moduleList.setBackground(Theme.BG);
        moduleList.setLayout(new BoxLayout(moduleList, BoxLayout.Y_AXIS));
        JScrollPane scroll = new JScrollPane(moduleList);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        scroll.getViewport().setBackground(Theme.BG);
        scroll.getVerticalScrollBar().setUnitIncrement(18);
        settingsDrawer = new SettingsDrawer(state);
        settingsDrawer.setPreferredSize(new Dimension(320, 600));
        page.add(scroll, BorderLayout.CENTER);
        page.add(settingsDrawer, BorderLayout.EAST);
        return page;
    }

    public void refreshModules(String query) {
        if (moduleList == null) {
            return;
        }
        List<ModuleDef> found;
        if (query == null || query.isBlank()) {
            found = catalog.byCategory(category);
        } else {
            found = catalog.search(query);
        }
        moduleList.removeAll();
        String lastSub = "";
        for (ModuleDef module : found) {
            String sub = module.subcategory == null || module.subcategory.isBlank() ? "" : module.subcategory;
            if (!sub.equals(lastSub) && !sub.isBlank() && (query == null || query.isBlank())) {
                JLabel header = new JLabel(sub);
                header.setForeground(Theme.MUTED);
                header.setFont(Theme.ui(11, Font.BOLD));
                header.setBorder(new EmptyBorder(10, 4, 6, 0));
                header.setAlignmentX(Component.LEFT_ALIGNMENT);
                moduleList.add(header);
                lastSub = sub;
            }
            ModuleCard card = new ModuleCard(module, state, this);
            card.setAlignmentX(Component.LEFT_ALIGNMENT);
            moduleList.add(card);
            moduleList.add(Box.createVerticalStrut(8));
        }
        if (found.isEmpty()) {
            JLabel empty = new JLabel("ничего не найдено");
            empty.setForeground(Theme.MUTED);
            moduleList.add(empty);
        }
        moduleList.add(Box.createVerticalGlue());
        moduleList.revalidate();
        moduleList.repaint();
        refreshStatus();
    }

    private void refreshStatus() {
        long on = catalog.modules.stream().filter(m -> state.isEnabled(m.id)).count();
        status.setText(tab + " · " + category + " · " + on + "/" + catalog.modules.size()
                + " · UM " + catalog.modules.size() + " · " + catalog.menuClass);
    }

    static final class SettingsDrawer extends JPanel {
        private final ClientState state;
        private final JLabel title = new JLabel("settings");
        private final JLabel meta = new JLabel(" ");
        private final JPanel body = new JPanel();
        private final JTextArea source = new JTextArea();

        SettingsDrawer(ClientState state) {
            this.state = state;
            setBackground(Theme.PANEL);
            setLayout(new BorderLayout(0, 8));
            setBorder(new EmptyBorder(16, 14, 14, 14));
            title.setForeground(Theme.TEXT);
            title.setFont(Theme.ui(16, Font.BOLD));
            meta.setForeground(Theme.MUTED);
            meta.setFont(Theme.ui(11, Font.PLAIN));
            JPanel head = new JPanel(new BorderLayout());
            head.setOpaque(false);
            head.add(title, BorderLayout.NORTH);
            head.add(meta, BorderLayout.SOUTH);
            body.setOpaque(false);
            body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));
            source.setEditable(false);
            source.setBackground(new Color(0x101018));
            source.setForeground(Theme.MUTED);
            source.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 11));
            source.setLineWrap(true);
            source.setWrapStyleWord(false);
            source.setText("выбери модуль · dots / ПКМ");
            JScrollPane src = new JScrollPane(source);
            src.setBorder(BorderFactory.createLineBorder(Theme.STROKE));
            src.setPreferredSize(new Dimension(280, 220));
            add(head, BorderLayout.NORTH);
            add(body, BorderLayout.CENTER);
            add(src, BorderLayout.SOUTH);
        }

        void show(ModuleDef module) {
            title.setText(module.name);
            meta.setText(module.className + " · " + module.methodCount + " methods");
            body.removeAll();
            if (module.settings == null || module.settings.isEmpty()) {
                JLabel none = new JLabel("нет settings в константах");
                none.setForeground(Theme.MUTED);
                none.setAlignmentX(Component.LEFT_ALIGNMENT);
                body.add(none);
            } else {
                for (ModuleDef.SettingDef setting : module.settings) {
                    JCheckBox box = new JCheckBox(setting.label);
                    box.setSelected(state.setting(module.id, setting.id));
                    box.setOpaque(false);
                    box.setForeground(Theme.TEXT);
                    box.setAlignmentX(Component.LEFT_ALIGNMENT);
                    box.addActionListener(e -> state.setSetting(module.id, setting.id, box.isSelected()));
                    body.add(box);
                }
            }
            source.setText(loadSource(module));
            source.setCaretPosition(0);
            body.revalidate();
            body.repaint();
        }

        private String loadSource(ModuleDef module) {
            Path path = Path.of("decompiled/modules/KDFzREm/" + module.bytecodeClass + ".java");
            if (!Files.isRegularFile(path)) {
                path = Path.of("decompiled/KDFzREm/" + module.bytecodeClass + ".java");
            }
            if (!Files.isRegularFile(path)) {
                return "// " + module.className + " not decompiled yet\n// bytecode in runtime/nursultan-classes-restored.jar";
            }
            try {
                String text = Files.readString(path, StandardCharsets.UTF_8);
                return text.length() > 12000 ? text.substring(0, 12000) + "\n// … truncated" : text;
            } catch (Exception e) {
                return e.getMessage();
            }
        }
    }

    static final class SimpleDocumentListener implements javax.swing.event.DocumentListener {
        private final Runnable run;

        SimpleDocumentListener(Runnable run) {
            this.run = run;
        }

        @Override
        public void insertUpdate(javax.swing.event.DocumentEvent e) {
            run.run();
        }

        @Override
        public void removeUpdate(javax.swing.event.DocumentEvent e) {
            run.run();
        }

        @Override
        public void changedUpdate(javax.swing.event.DocumentEvent e) {
            run.run();
        }
    }
}
