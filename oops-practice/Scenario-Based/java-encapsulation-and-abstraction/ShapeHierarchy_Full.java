
abstract class Shape {

    public abstract double area();
    public abstract double perimeter();

    public void displayReport() {
        System.out.printf("%-15s Area = %.2f  Perimeter = %.2f%n",
                this.getClass().getSimpleName(),
                area(),
                perimeter());
    }
}

class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

public class ShapeHierarchy {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(10, 4),
                new Triangle(3, 4, 5),
                new Circle(7),
                new Rectangle(8, 6)
        };

        System.out.println("==============================================");
        System.out.println("              SHAPE AREA REPORT");
        System.out.println("==============================================");

        for (Shape shape : shapes) {
            shape.displayReport();
        }

        System.out.println("==============================================");
    }
}
