
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhileLoops extends JPanel {

    public int w = 760;
    public int h = 540;

    // Practice using Loops, random #s and
// methods
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(10, 10, this.w, this.h);

        // Guidelines
        // g2.drawLine(10+760/2, 10, 10+760/2, 10+540);

        // g2.drawLine(10, 10+540/2, 10+760, 10+540/2);

        // Draw pattern at 1/1 scale
        this.drawPattern(g2, 1.0, 10, 10);
        // Draw pattern at 1/2 scale
        this.drawPattern(g2, 1.0/2, (this.w/4)+10, (this.h/4)+10);
        // Draw pattern at 1/4 scale
        this.drawPattern(g2, 1.0/4, (this.w/4 + this.w/8)+10, (this.h/4 + this.h/8)+10);
        // Draw pattern at 1/8 scale
        this.drawPattern(g2, 1.0/8, (this.w/4 + this.w/8 + this.w/16)+10, (this.h/4 + this.h/8 + this.h/16)+10);
        // Draw pattern at 1/16 scale
        this.drawPattern(g2, 1.0/16, (this.w/4 + this.w/8 + this.w/16 + this.w/32)+10, (this.h/4 + this.h/8 + this.h/16 + this.h/32)+10);

    }

    public void drawPattern(Graphics2D g2, double factor, int x, int y) {

        int y1, y2, x1, x2 = 0;

        // Upper right corner

        // Set positions to upper right corner for drawing
        x2 = (int) (this.w*factor) + x;
        y2 = 0 + y - (int)(factor*70);
        x1 = 0 + x;
        y1 = 0 + y;
        for (int i = 0; i <= 75*factor; i++) {
            if (y2-y > 0) { // If y2-y is not negative...
                g2.drawLine(x1, y1, x2, y2); // Draw line
            }
            x1 += 10;
            y2 += 8;
        }

        // Upper left corner

        // Set positions to upper left corner for drawing
        x2 = 0 + x;
        y2 = 0 + y - (int)(factor*70);
        x1 = (int) (this.w*factor) + x;
        y1 = 0 + y;
        for (int i = 0; i <= 75*factor; i++) {
            if (y2-y > 0) { // If y2-y is not negative...
                g2.drawLine(x1, y1, x2, y2); // Draw line
            }
            x1 -= 10;
            y2 += 8;
        }

        // Lower right corner
        x2 = (int) (this.w * factor) + x;
        y2 = (int) (this.h * factor) + y + (int)(factor*70);
        x1 = 0 + x;
        y1 = (int) (this.h * factor) + y;
        for (int i = 0; i <= 75*factor; i++) {
            // If the current y2 of the line doesn't
            // dip below a certain threshold
            if ((y2-y-((int) (this.h * factor))) < 0) {
                g2.drawLine(x1, y1, x2, y2); // Draw line
            }
            x1 += 10;
            y2 -= 8;
        }

        // Lower left corner
        x2 = 0 + x;
        y2 = 0 + y + (int)(factor*70);
        x1 = 0 + x;
        y1 = (int) (this.h * factor) + y;
        for (int i = 0; i <= 75*factor; i++) {
            // If the current y2 of the line doesn't
            // dip below a certain threshold
            if ((y2-y-((int) (this.h * factor))) < 0) {
                g2.drawLine(x1, y1, x2, y2); // Draw line
            }
            x1 += 10;
            y2 += 8;
        }
    }

    public static void main(String[] arg) {
        WhileLoops m = new WhileLoops();
    }
    public WhileLoops() {
        JFrame f = new JFrame("Method Use");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 600);
        f.add(this);
        f.setVisible(true);
    }
}
