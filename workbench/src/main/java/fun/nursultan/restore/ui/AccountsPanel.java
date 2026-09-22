// Java 21, restored account manager
package fun.nursultan.restore.ui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public final class AccountsPanel extends JPanel {
    public AccountsPanel() {
        setBackground(Theme.BG);
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(8, 16, 16, 16));
        JLabel title = new JLabel("аккаунты");
        title.setForeground(Theme.TEXT);
        title.setFont(Theme.ui(16, Font.BOLD));
        add(title, BorderLayout.NORTH);
        JPanel form = new JPanel(new GridLayout(0, 1, 8, 8));
        form.setOpaque(false);
        form.add(field("Microsoft", "account.type.microsoft"));
        form.add(field("Offline", "account.type.offline"));
        form.add(field("Offline generated", "account.type.offline-generated"));
        add(form, BorderLayout.CENTER);
    }

    private JPanel field(String label, String key) {
        JPanel card = new JPanel(new BorderLayout(8, 4));
        card.setBackground(Theme.PANEL);
        card.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Theme.STROKE), new EmptyBorder(10, 12, 10, 12)));
        JLabel name = new JLabel(label + "  ·  " + key);
        name.setForeground(Theme.TEXT);
        JTextField input = new JTextField();
        input.setBackground(Theme.PANEL_ALT);
        input.setForeground(Theme.TEXT);
        input.setCaretColor(Theme.TEXT);
        input.setBorder(BorderFactory.createLineBorder(Theme.STROKE));
        card.add(name, BorderLayout.NORTH);
        card.add(input, BorderLayout.CENTER);
        return card;
    }
}
