// Java 21, ready-course (preset) manager
package fun.nursultan.restore.ui;

import fun.nursultan.restore.state.ClientState;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.nio.file.Path;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public final class CoursesPanel extends JPanel {
    private final ClickGuiFrame frame;
    private final Path dir;
    private final DefaultListModel<String> model = new DefaultListModel<>();
    private final JList<String> list = new JList<>(model);
    private List<ClientState.Snapshot> courses = List.of();

    public CoursesPanel(ClickGuiFrame frame, Path dir) {
        this.frame = frame;
        this.dir = dir;
        setBackground(Theme.BG);
        setLayout(new BorderLayout(12, 12));
        setBorder(new EmptyBorder(8, 16, 16, 16));
        JLabel title = new JLabel("реди курсы / пресеты");
        title.setForeground(Theme.TEXT);
        title.setFont(Theme.ui(16, Font.BOLD));
        add(title, BorderLayout.NORTH);
        list.setBackground(Theme.PANEL);
        list.setForeground(Theme.TEXT);
        list.setSelectionBackground(Theme.ACCENT_DIM);
        JScrollPane scroll = new JScrollPane(list);
        scroll.setBorder(BorderFactory.createLineBorder(Theme.STROKE));
        add(scroll, BorderLayout.CENTER);
        JPanel actions = new JPanel();
        actions.setOpaque(false);
        JTextField name = new JTextField("pvp-ready");
        name.setPreferredSize(new Dimension(180, 28));
        name.setBackground(Theme.PANEL_ALT);
        name.setForeground(Theme.TEXT);
        name.setCaretColor(Theme.TEXT);
        JButton save = new JButton("сохранить курс");
        JButton load = new JButton("загрузить");
        style(save);
        style(load);
        save.addActionListener(e -> {
            try {
                ClientState.Snapshot snapshot = frame.state().snapshot(name.getText().trim());
                ClientState.writeCourse(dir, snapshot);
                reload();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });
        load.addActionListener(e -> {
            int i = list.getSelectedIndex();
            if (i >= 0 && i < courses.size()) {
                frame.state().apply(courses.get(i));
                frame.refreshModules("");
            }
        });
        actions.add(name);
        actions.add(save);
        actions.add(load);
        add(actions, BorderLayout.SOUTH);
        seedBundled();
        reload();
    }

    private void seedBundled() {
        String[] bundled = {"pvp-ready.json", "farm-ready.json"};
        try {
            java.nio.file.Files.createDirectories(dir);
            for (String file : bundled) {
                Path target = dir.resolve(file);
                if (java.nio.file.Files.exists(target)) {
                    continue;
                }
                try (var in = CoursesPanel.class.getResourceAsStream("/nursultan/courses/" + file)) {
                    if (in != null) {
                        java.nio.file.Files.copy(in, target);
                    }
                }
            }
        } catch (Exception ignored) {
            // bundled courses are optional
        }
    }

    private void reload() {
        courses = ClientState.readCourses(dir);
        model.clear();
        for (ClientState.Snapshot snapshot : courses) {
            model.addElement(snapshot.name + "  ·  " + snapshot.enabledCount() + " on");
        }
    }

    private void style(JButton button) {
        button.setBackground(Theme.PANEL_ALT);
        button.setForeground(Theme.TEXT);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(6, 12, 6, 12));
    }
}
