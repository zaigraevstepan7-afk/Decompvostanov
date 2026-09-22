// Java 21, Nursultan module card: switch / bind / dots
package fun.nursultan.restore.ui;

import fun.nursultan.restore.catalog.ModuleDef;
import fun.nursultan.restore.state.ClientState;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class ModuleCard extends JPanel {
    private final ModuleDef module;
    private final ClientState state;
    private boolean hover;

    public ModuleCard(ModuleDef module, ClientState state, Listener listener) {
        this.module = module;
        this.state = state;
        setOpaque(false);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(640, 68));
        setMaximumSize(new Dimension(Integer.MAX_VALUE, 68));
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        JPanel text = new JPanel(new GridBagLayout());
        text.setOpaque(false);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        c.weightx = 1;
        c.insets = new Insets(0, 0, 2, 0);
        JLabel name = new JLabel(module.name);
        name.setForeground(Theme.TEXT);
        name.setFont(Theme.ui(14, Font.BOLD));
        text.add(name, c);
        c.gridy = 1;
        String sub = module.subcategory == null || module.subcategory.isBlank() ? module.category : module.subcategory;
        JLabel desc = new JLabel(sub + "  ·  " + module.className + "  ·  " + module.methodCount + " fn");
        desc.setForeground(Theme.MUTED);
        desc.setFont(Theme.ui(11, Font.PLAIN));
        text.add(desc, c);

        JPanel actions = new JPanel();
        actions.setOpaque(false);
        IconButton bind = new IconButton(bindLabel());
        bind.onClick(() -> listener.bind(module));
        IconButton dots = new IconButton("···");
        dots.onClick(() -> listener.settings(module));
        Switch sw = new Switch(state.isEnabled(module.id));
        sw.onChange(on -> {
            state.setEnabled(module.id, on);
            listener.toggled(module);
            repaint();
        });
        actions.add(bind);
        actions.add(dots);
        actions.add(Box.createHorizontalStrut(4));
        actions.add(sw);

        JPanel inner = new JPanel(new BorderLayout());
        inner.setOpaque(false);
        inner.add(text, BorderLayout.CENTER);
        inner.add(actions, BorderLayout.EAST);
        add(inner, BorderLayout.CENTER);

        MouseAdapter mouse = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                hover = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hover = false;
                repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    listener.settings(module);
                } else if (e.getButton() == MouseEvent.BUTTON2) {
                    listener.bind(module);
                } else if (e.getClickCount() == 2) {
                    sw.setOn(!sw.isOn());
                } else if (e.getButton() == MouseEvent.BUTTON1) {
                    listener.settings(module);
                }
            }
        };
        addMouseListener(mouse);
        text.addMouseListener(mouse);
        name.addMouseListener(mouse);
        desc.addMouseListener(mouse);
    }

    private String bindLabel() {
        String bind = state.bind(module.id);
        return bind == null || bind.isBlank() ? "R" : bind;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        boolean on = state.isEnabled(module.id);
        g2.setColor(hover || on ? new Color(0x1A1A24) : Theme.PANEL);
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 12, 12);
        g2.setColor(on ? Theme.ACCENT : Theme.STROKE);
        g2.fillRoundRect(0, 10, 3, getHeight() - 20, 3, 3);
        g2.dispose();
        super.paintComponent(g);
    }

    public interface Listener {
        void settings(ModuleDef module);

        void bind(ModuleDef module);

        void toggled(ModuleDef module);
    }
}
