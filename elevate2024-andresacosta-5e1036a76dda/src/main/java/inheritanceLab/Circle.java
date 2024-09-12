package inheritanceLab;

import static java.lang.Math.PI;

class Circle extends Shape implements Drawable{

    private double radius;

    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }

    @Override
    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Area is " + calculateArea() + " and the circumference is " + calculateCircumference();
    }
}


