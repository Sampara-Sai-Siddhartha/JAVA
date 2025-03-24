import java.lang.Math;

// Shape class
class Shape {
    // Method to get the perimeter
    double getPerimeter() {
        System.out.println("Getting perimeter of a shape");
        return 0.0;
    }

    // Method to get the area
    double getArea() {
        System.out.println("Getting area of a shape");
        return 0.0;
    }
}

// Circle subclass extending Shape
class Circle extends Shape {
    // Property of the circle
    double radius;

    // Constructor to initialize the radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Override getPerimeter method to calculate perimeter of circle
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override getArea method to calculate area of circle
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class ShapeTest2 {
    public static void main(String[] args) {
        // Create an instance of Shape (generic)
        Shape myShape = new Shape();

        // Call getPerimeter and getArea methods of Shape
        System.out.println("Calling getPerimeter and getArea methods of Shape:");
        double shapePerimeter = myShape.getPerimeter();
        double shapeArea = myShape.getArea();
        System.out.println("Perimeter: " + shapePerimeter);
        System.out.println("Area: " + shapeArea);

        // Create an instance of Circle
        Circle myCircle = new Circle(5.0);

        // Call getPerimeter and getArea methods of Circle (which overrides Shape's methods)
        System.out.println("\nCalling getPerimeter and getArea methods of Circle:");
        double circlePerimeter = myCircle.getPerimeter();
        double circleArea = myCircle.getArea();
        System.out.println("Perimeter of Circle: " + circlePerimeter);
        System.out.println("Area of Circle: " + circleArea);
    }
}
