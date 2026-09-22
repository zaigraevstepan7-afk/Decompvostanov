// Java 21, restored class / method browser
package fun.nursultan.restore.ui;

import fun.nursultan.restore.catalog.Catalog;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public final class ClassBrowser extends JPanel {
    private final Catalog catalog;
    private final DefaultListModel<String> classModel = new DefaultListModel<>();
    private final DefaultListModel<String> methodModel = new DefaultListModel<>();
    private final JList<String> classList = new JList<>(classModel);
    private final JList<String> methodList = new JList<>(methodModel);
    private List<String> filtered;

    public ClassBrowser(Catalog catalog) {
        this.catalog = catalog;
        this.filtered = catalog.classes;
        setBackground(Theme.BG);
        setLayout(new BorderLayout(8, 8));
        setBorder(new EmptyBorder(8, 16, 16, 16));
        JLabel title = new JLabel("классы · " + catalog.classCount + "  ·  функции · " + catalog.methodCount());
        title.setForeground(Theme.TEXT);
        title.setFont(Theme.ui(16, Font.BOLD));
        JTextField search = new JTextField();
        search.setBackground(Theme.PANEL_ALT);
        search.setForeground(Theme.TEXT);
        search.setCaretColor(Theme.TEXT);
        search.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Theme.STROKE), new EmptyBorder(6, 8, 6, 8)));
        search.getDocument().addDocumentListener(new ClickGuiFrame.SimpleDocumentListener(() -> filter(search.getText())));
        JPanel north = new JPanel(new BorderLayout(8, 8));
        north.setOpaque(false);
        north.add(title, BorderLayout.NORTH);
        north.add(search, BorderLayout.SOUTH);
        add(north, BorderLayout.NORTH);
        style(classList);
        style(methodList);
        classList.addListSelectionListener(e -> showMethods());
        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, wrap(classList), wrap(methodList));
        split.setResizeWeight(0.42);
        split.setBorder(BorderFactory.createEmptyBorder());
        add(split, BorderLayout.CENTER);
        refill();
    }

    private void filter(String query) {
        String q = query == null ? "" : query.trim().toLowerCase();
        if (q.isEmpty()) {
            filtered = catalog.classes;
        } else {
            filtered = catalog.classes.stream().filter(name -> name.toLowerCase().contains(q)).toList();
        }
        refill();
    }

    private void refill() {
        classModel.clear();
        for (String name : filtered) {
            int methods = catalog.methods.getOrDefault(name, List.of()).size();
            classModel.addElement(name + "   (" + methods + ")");
        }
        methodModel.clear();
    }

    private void showMethods() {
        int i = classList.getSelectedIndex();
        methodModel.clear();
        if (i < 0 || i >= filtered.size()) {
            return;
        }
        for (String method : catalog.methods.getOrDefault(filtered.get(i), List.of())) {
            methodModel.addElement(method);
        }
    }

    private static void style(JList<String> list) {
        list.setBackground(Theme.PANEL);
        list.setForeground(Theme.TEXT);
        list.setSelectionBackground(Theme.ACCENT_DIM);
        list.setFont(Theme.ui(12, Font.PLAIN));
    }

    private static JScrollPane wrap(JList<String> list) {
        JScrollPane scroll = new JScrollPane(list);
        scroll.setBorder(BorderFactory.createLineBorder(Theme.STROKE));
        return scroll;
    }
}
