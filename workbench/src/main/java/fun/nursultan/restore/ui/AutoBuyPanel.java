// Java 21, restored AutoBuy categories
package fun.nursultan.restore.ui;

import fun.nursultan.restore.catalog.Catalog;
import fun.nursultan.restore.catalog.ModuleDef;
import fun.nursultan.restore.state.ClientState;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public final class AutoBuyPanel extends JPanel {
    private static final String[] CATS = {
        "armor", "arrows", "blocks", "consumables", "potions", "spheres", "talismans", "tools", "other"
    };

    public AutoBuyPanel(Catalog catalog, ClientState state) {
        setBackground(Theme.BG);
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(8, 16, 16, 16));
        JLabel title = new JLabel("AutoBuy · nursultan.fun");
        title.setForeground(Theme.TEXT);
        title.setFont(Theme.ui(16, Font.BOLD));
        add(title, BorderLayout.NORTH);
        JPanel grid = new JPanel(new GridLayout(0, 3, 10, 10));
        grid.setOpaque(false);
        for (ModuleDef module : catalog.byCategory("autobuy")) {
            grid.add(row(module.name, module.description, state, module.id));
        }
        for (String cat : CATS) {
            grid.add(row(cat, "autobuy.category." + cat, state, "autobuy-cat-" + cat));
        }
        add(grid, BorderLayout.CENTER);
    }

    private JPanel row(String name, String desc, ClientState state, String id) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(Theme.PANEL);
        card.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Theme.STROKE), new EmptyBorder(12, 12, 12, 12)));
        JLabel label = new JLabel(name);
        label.setForeground(Theme.TEXT);
        JLabel sub = new JLabel(desc);
        sub.setForeground(Theme.MUTED);
        JCheckBox on = new JCheckBox("enabled");
        on.setOpaque(false);
        on.setForeground(Theme.ACCENT);
        on.setSelected(state.isEnabled(id));
        on.addActionListener(e -> state.setEnabled(id, on.isSelected()));
        card.add(label, BorderLayout.NORTH);
        card.add(sub, BorderLayout.CENTER);
        card.add(on, BorderLayout.SOUTH);
        return card;
    }
}
