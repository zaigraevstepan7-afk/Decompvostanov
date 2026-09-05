// Java 21, restored Nursultan click GUI
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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public final class ClickGuiFrame extends JFrame {
    public static final String[] TABS = {"modules", "hud", "autobuy", "accounts", "courses", "classes"};

    private final Catalog catalog;
    private final ClientState state;
    private final Path dataDir;
    private final CardLayout cards = new CardLayout();
    private final JPanel cardHost = new JPanel(cards);
    private final JLabel status = new JLabel();
    private String category = "combat";
    private String tab = "modules";
    private JPanel moduleGrid;
    private JTextField search;
    private SettingsDrawer settingsDrawer;

    public ClickGuiFrame(Catalog catalog, Path dataDir) {
        super("Nursultan");
        this.catalog = catalog;
        this.dataDir = dataDir;
        this.state = new ClientState(catalog, dataDir);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1180, 740));
        setSize(1280, 800);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Theme.BG);
        setLayout(new BorderLayout());
        add(buildSidebar(), BorderLayout.WEST);
        add(buildCenter(), BorderLayout.CENTER);
        state.addListener(this::refreshStatus);
        refreshModules("");
        refreshStatus();
    }

    public ClientState state() {
        return state;
    }

    public void showTab(String id) {
        tab = id;
        cards.show(cardHost, id);
        refreshStatus();
        repaint();
    }

    public void showCategory(String id) {
        category = id;
        if (!"modules".equals(tab)) {
            showTab("modules");
        }
        refreshModules(search.getText());
    }

    private JComponent buildSidebar() {
        JPanel rail = new JPanel();
        rail.setBackground(Theme.PANEL);
        rail.setPreferredSize(new Dimension(214, 800));
        rail.setLayout(new BoxLayout(rail, BoxLayout.Y_AXIS));
        rail.setBorder(new EmptyBorder(18, 16, 18, 16));

        JLabel mark = new JLabel("NURSULTAN");
        mark.setForeground(Theme.ACCENT);
        mark.setFont(Theme.ui(20, Font.BOLD));
        mark.setAlignmentX(Component.LEFT_ALIGNMENT);
        rail.add(mark);

        JLabel sub = new JLabel("restored clickgui");
        sub.setForeground(Theme.MUTED);
        sub.setFont(Theme.ui(11, Font.PLAIN));
        sub.setAlignmentX(Component.LEFT_ALIGNMENT);
        rail.add(sub);
        rail.add(Box.createVerticalStrut(18));

        String[] cats = {"combat", "movement", "player", "visual", "misc"};
        for (String cat : cats) {
            rail.add(navButton(cat.toUpperCase(), () -> showCategory(cat)));
            rail.add(Box.createVerticalStrut(6));
        }
        rail.add(Box.createVerticalStrut(10));
        String[] extras = {"hud", "autobuy", "accounts", "courses", "classes"};
        for (String extra : extras) {
            rail.add(navButton(extra.toUpperCase(), () -> showTab(extra)));
            rail.add(Box.createVerticalStrut(6));
        }
        rail.add(Box.createVerticalGlue());
        JLabel stats = new JLabel("<html>" + catalog.classCount + " classes<br>" + catalog.lambdaCount
                + " lambdas<br>" + catalog.methodCount() + " methods</html>");
        stats.setForeground(Theme.MUTED);
        stats.setFont(Theme.ui(11, Font.PLAIN));
        stats.setAlignmentX(Component.LEFT_ALIGNMENT);
        rail.add(stats);
        return rail;
    }

    private JButton navButton(String label, Runnable action) {
        JButton button = new JButton(label);
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 34));
        button.setBackground(Theme.PANEL_ALT);
        button.setForeground(Theme.TEXT);
        button.setBorder(BorderFactory.createEmptyBorder(6, 10, 6, 10));
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
        status.setBorder(new EmptyBorder(8, 16, 10, 16));
        root.add(status, BorderLayout.SOUTH);
        return root;
    }

    private JComponent buildTop() {
        JPanel top = new JPanel(new BorderLayout());
        top.setBackground(Theme.BG);
        top.setBorder(new EmptyBorder(14, 16, 8, 16));
        JLabel title = new JLabel("меню");
        title.setForeground(Theme.TEXT);
        title.setFont(Theme.ui(18, Font.BOLD));
        search = new JTextField();
        search.setBackground(Theme.PANEL_ALT);
        search.setForeground(Theme.TEXT);
        search.setCaretColor(Theme.TEXT);
        search.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Theme.STROKE), new EmptyBorder(6, 10, 6, 10)));
        search.setPreferredSize(new Dimension(280, 32));
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
        page.setBorder(new EmptyBorder(0, 16, 8, 16));
        moduleGrid = new JPanel();
        moduleGrid.setBackground(Theme.BG);
        JScrollPane scroll = new JScrollPane(moduleGrid);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        scroll.getViewport().setBackground(Theme.BG);
        scroll.getVerticalScrollBar().setUnitIncrement(18);
        settingsDrawer = new SettingsDrawer(state);
        settingsDrawer.setPreferredSize(new Dimension(300, 600));
        page.add(scroll, BorderLayout.CENTER);
        page.add(settingsDrawer, BorderLayout.EAST);
        return page;
    }

    public void refreshModules(String query) {
        if (moduleGrid == null) {
            return;
        }
        List<ModuleDef> found = catalog.search(query);
        if (query == null || query.isBlank()) {
            found = catalog.byCategory(category);
        }
        moduleGrid.removeAll();
        moduleGrid.setLayout(new GridLayout(0, 2, 10, 10));
        for (ModuleDef module : found) {
            moduleGrid.add(moduleCard(module));
        }
        if (found.isEmpty()) {
            JLabel empty = new JLabel("ничего не найдено");
            empty.setForeground(Theme.MUTED);
            moduleGrid.setLayout(new FlowLayout(FlowLayout.LEFT));
            moduleGrid.add(empty);
        }
        moduleGrid.revalidate();
        moduleGrid.repaint();
        refreshStatus();
    }

    private JComponent moduleCard(ModuleDef module) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(state.isEnabled(module.id) ? Theme.PANEL_ALT : Theme.PANEL);
        card.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(state.isEnabled(module.id) ? Theme.ACCENT_DIM : Theme.STROKE),
                new EmptyBorder(10, 12, 10, 12)));
        JLabel name = new JLabel(module.name);
        name.setForeground(Theme.TEXT);
        name.setFont(Theme.ui(14, Font.BOLD));
        JLabel desc = new JLabel("<html>" + module.description + "</html>");
        desc.setForeground(Theme.MUTED);
        desc.setFont(Theme.ui(11, Font.PLAIN));
        JCheckBox toggle = new JCheckBox("on");
        toggle.setSelected(state.isEnabled(module.id));
        toggle.setOpaque(false);
        toggle.setForeground(Theme.ACCENT);
        toggle.addActionListener(e -> {
            state.setEnabled(module.id, toggle.isSelected());
            refreshModules(search.getText());
            settingsDrawer.show(module);
        });
        JPanel head = new JPanel(new BorderLayout());
        head.setOpaque(false);
        head.add(name, BorderLayout.WEST);
        head.add(toggle, BorderLayout.EAST);
        card.add(head, BorderLayout.NORTH);
        card.add(desc, BorderLayout.CENTER);
        card.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                settingsDrawer.show(module);
            }
        });
        return card;
    }

    private void refreshStatus() {
        long on = catalog.modules.stream().filter(m -> state.isEnabled(m.id)).count();
        status.setText("tab " + tab + " · " + category + " · modules " + on + "/" + catalog.modules.size()
                + " · " + catalog.initializer + " · courses in " + dataDir.resolve("courses"));
    }

    public Catalog catalog() {
        return catalog;
    }

    static final class SettingsDrawer extends JPanel {
        private final ClientState state;
        private final JLabel title = new JLabel("settings");
        private final JPanel body = new JPanel();

        SettingsDrawer(ClientState state) {
            this.state = state;
            setBackground(Theme.PANEL);
            setLayout(new BorderLayout());
            setBorder(new EmptyBorder(14, 14, 14, 14));
            title.setForeground(Theme.TEXT);
            title.setFont(Theme.ui(15, Font.BOLD));
            body.setOpaque(false);
            body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));
            add(title, BorderLayout.NORTH);
            add(body, BorderLayout.CENTER);
            JLabel hint = new JLabel("выбери модуль");
            hint.setForeground(Theme.MUTED);
            body.add(hint);
        }

        void show(ModuleDef module) {
            title.setText(module.name);
            body.removeAll();
            JLabel desc = new JLabel("<html>" + module.description + "</html>");
            desc.setForeground(Theme.MUTED);
            desc.setAlignmentX(Component.LEFT_ALIGNMENT);
            body.add(desc);
            body.add(Box.createVerticalStrut(10));
            if (module.settings == null || module.settings.isEmpty()) {
                JLabel none = new JLabel("нет дополнительных настроек");
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
            body.revalidate();
            body.repaint();
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
