package inheritanceLab;

import static java.lang.Math.PI;

class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double x, double y, String color,double width, double height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    @Override
    public double calculateCircumference() {
        return 2 * width * height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public String toString() {
        return "Area is " + calculateArea() + " and the circumference is " + calculateCircumference();
    }
}


