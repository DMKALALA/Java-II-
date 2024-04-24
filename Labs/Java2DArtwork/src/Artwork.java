import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Artwork extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Anti-aliasing for smoother edges
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw different 2D primitives
        g2d.setColor(Color.RED);
        g2d.fillRect(50, 50, 100, 100); // Rectangle

        g2d.setColor(Color.BLUE);
        g2d.fillOval(200, 50, 100, 100); // Oval

        g2d.setColor(Color.GREEN);
        g2d.fill(new Arc2D.Double(350, 50, 100, 100, 90, 180, Arc2D.OPEN)); // Arc

        g2d.setColor(Color.YELLOW);
        g2d.fill(new RoundRectangle2D.Double(50, 200, 100, 100, 50, 50)); // Rounded Rectangle

        g2d.setColor(Color.CYAN);
        g2d.fill(new Ellipse2D.Double(200, 200, 150, 100)); // Ellipse

        g2d.setColor(Color.MAGENTA);
        int[] xPoints = {350, 450, 400};
        int[] yPoints = {200, 200, 300};
        g2d.fillPolygon(xPoints, yPoints, 3); // Triangle
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java 2D Artwork");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Artwork());
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
