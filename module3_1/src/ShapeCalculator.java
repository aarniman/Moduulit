import java.util.ArrayList;

public class ShapeCalculator{
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0));
        shapes.add(new Triangle(3.0, 8.0));

        System.out.println("Shape Calculator \n");

        for (Shape s: shapes) {
            System.out.println(s.toString());
        }
    }
}

class Shape {

    public double calculateArea(){

        return 0;
    }

    public String colour(){

        return "";
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return super.calculateArea() + (Math.PI*Math.pow(radius, 2));
    }

    public String toString(){
        return ("Area of Circle with radius " + radius + ": " + calculateArea());
    }
}

class Rectangle extends Shape{
    private double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return super.calculateArea() + (width*height);
    }

    public String toString(){
        return ("Area of Rectangle with width " + width + " and height " + height + ": " + calculateArea());
    }
}

class Triangle extends Shape{
    private double width, height;

    public Triangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return super.calculateArea() + (width*height/2);
    }

    public String toString(){
        return ("Area of Triangle with width " + width + " and height " + height + ": " + calculateArea());
    }
}