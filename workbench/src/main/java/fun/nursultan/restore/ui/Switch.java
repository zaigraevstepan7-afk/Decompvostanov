// Java 21, Nursultan pill switch
package fun.nursultan.restore.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;
import javax.swing.JComponent;

public final class Switch extends JComponent {
    private boolean on;
    private Consumer<Boolean> listener;

    public Switch(boolean on) {
        this.on = on;
        setPreferredSize(new Dimension(34, 18));
        setMinimumSize(getPreferredSize());
        setMaximumSize(getPreferredSize());
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    setOn(!Switch.this.on);
                }
            }
        });
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean value) {
        if (this.on == value) {
            return;
        }
        this.on = value;
        if (listener != null) {
            listener.accept(value);
        }
        repaint();
    }

    public void onChange(Consumer<Boolean> listener) {
        this.listener = listener;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        g2.setColor(on ? Theme.ACCENT : new Color(0x2E2E3A));
        g2.fillRoundRect(0, 0, w - 1, h - 1, h, h);
        int knob = h - 4;
        int x = on ? w - knob - 2 : 2;
        g2.setColor(Color.WHITE);
        g2.fillOval(x, 2, knob, knob);
        g2.dispose();
    }
}
