// Java 21, bind / dots glyph button
package fun.nursultan.restore.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public final class IconButton extends JComponent {
    private final String glyph;
    private boolean hover;
    private Runnable action;

    public IconButton(String glyph) {
        this.glyph = glyph;
        setPreferredSize(new Dimension(26, 26));
        setMinimumSize(getPreferredSize());
        setMaximumSize(getPreferredSize());
        setOpaque(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addMouseListener(new MouseAdapter() {
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
                if (action != null) {
                    action.run();
                }
            }
        });
    }

    public void onClick(Runnable action) {
        this.action = action;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (hover) {
            g2.setColor(new Color(0x2A2A38));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 8, 8);
        }
        g2.setColor(hover ? Theme.TEXT : Theme.MUTED);
        g2.setFont(Theme.ui(12, Font.BOLD));
        int tw = g2.getFontMetrics().stringWidth(glyph);
        int th = g2.getFontMetrics().getAscent();
        g2.drawString(glyph, (getWidth() - tw) / 2, (getHeight() + th) / 2 - 3);
        g2.dispose();
    }
}
