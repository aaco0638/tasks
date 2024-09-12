package inheritanceLab;

import javax.swing.*;
import java.awt.*;

public abstract class Shape {
    private double x;
    private double y;
    private String color;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;


    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract double calculateCircumference();

    public abstract double calculateArea();


    public void draw() {
            // Create a new JFrame for displaying the circle
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setVisible(true);

            // Create a JPanel for custom drawing
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    // Set the drawing color to red and fill an oval
                    g.setColor(Color.RED);
                    g.fillOval(100, 100, 200, 200);
                }
            };

            // Add the panel to the frame
            frame.add(panel);
        }
    }




