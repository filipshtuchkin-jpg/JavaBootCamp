package sef.module6.activity;


public class AbstractActivity {
    public static void main(String args[]) {
        // TODO: Create a Rectangle object, set color to "Blue", and print the color
        // TODO: Print the area and perimeter of the rectangle (using length = 2, breadth = 4, radius = 0)
Shape rectangle = new Rectangle();
        rectangle.setColor("Blue");
        System.out.println("Rectangle Color: " + rectangle.getColor());
        double length = 2;
        double breadth = 4;
        double rectangleArea = rectangle.calculateArea(length, breadth, 0);
        double rectanglePerimeter = rectangle.calculatePerimeter(length, breadth, 0);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

        // TODO: Create a Circle object, set color to "Pink", and print the color
        // TODO: Print the area and perimeter of the circle (using length = 0, breadth = 0, radius = 5)

Shape circle = new Circle();
circle.setColor("Pink");
System.out.println("Circle Color: " + circle.getColor());
double radius = 5;
double circleArea = circle.calculateArea(0, 0, radius);
double circlePerimeter = circle.calculatePerimeter(0, 0, radius);
System.out.println("Circle Area: " + circleArea);
System.out.println("Circle Perimeter: " + circlePerimeter);
    }
}