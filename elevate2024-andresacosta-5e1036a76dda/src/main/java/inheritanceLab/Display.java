package inheritanceLab;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class Display {
    private static JPanel canvas;

    public static void main(String[] a) {
        initGUI();
    }

    private static void drawAllShapes(Graphics g) {
        //rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 150);  // x, y, width, height

        // Circle
        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 100); //TODO: Implement me

        BankAccount b1 = new BankAccount(10.1,123);
        b1.draw(g);
    }

    private static void initGUI() {
        JFrame frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas = new JPanel() {
            public void paintComponent(Graphics g) {
                drawAllShapes(g);
            }
        };
        canvas.setPreferredSize(new Dimension(500,500));
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
}