// Java 21, restored HUD editor
package fun.nursultan.restore.ui;

import fun.nursultan.restore.catalog.Catalog;
import fun.nursultan.restore.catalog.ModuleDef;
import fun.nursultan.restore.state.ClientState;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public final class HudPanel extends JPanel {
    public HudPanel(Catalog catalog, ClientState state) {
        setBackground(Theme.BG);
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(8, 16, 16, 16));
        JLabel title = new JLabel("HUD · " + catalog.hudClass);
        title.setForeground(Theme.TEXT);
        title.setFont(Theme.ui(16, Font.BOLD));
        add(title, BorderLayout.NORTH);
        JPanel grid = new JPanel(new GridLayout(0, 3, 10, 10));
        grid.setOpaque(false);
        for (ModuleDef module : catalog.byCategory("hud")) {
            grid.add(widget(module, state));
        }
        for (String widget : catalog.hudWidgets) {
            boolean covered = catalog.byCategory("hud").stream().anyMatch(m -> m.id.contains(widget) || m.name.equalsIgnoreCase(widget));
            if (!covered) {
                ModuleDef extra = new ModuleDef();
                extra.id = "hud-" + widget;
                extra.name = widget;
                extra.description = "HUD widget " + widget;
                extra.category = "hud";
                grid.add(widget(extra, state));
            }
        }
        JPanel wrap = new JPanel(new FlowLayout(FlowLayout.LEFT));
        wrap.setOpaque(false);
        wrap.add(grid);
        add(grid, BorderLayout.CENTER);
    }

    private JPanel widget(ModuleDef module, ClientState state) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(Theme.PANEL);
        card.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Theme.STROKE), new EmptyBorder(12, 12, 12, 12)));
        JLabel name = new JLabel(module.name);
        name.setForeground(Theme.TEXT);
        JCheckBox on = new JCheckBox("visible");
        on.setOpaque(false);
        on.setForeground(Theme.ACCENT);
        on.setSelected(state.isEnabled(module.id));
        on.addActionListener(e -> state.setEnabled(module.id, on.isSelected()));
        card.add(name, BorderLayout.NORTH);
        card.add(on, BorderLayout.SOUTH);
        return card;
    }
}
