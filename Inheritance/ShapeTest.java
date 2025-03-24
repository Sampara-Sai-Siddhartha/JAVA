// Shape class
class Shape {
    // Method to get the area
    double getArea() {
        System.out.println("Getting area of a shape");
        return 0.0;
    }
}

// Rectangle subclass extending Shape
class Rectangle extends Shape {
    // Properties of the rectangle
    double length;
    double width;

    // Constructor to initialize length and width
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override getArea method to calculate area of rectangle
    @Override
    double getArea() {
        return length * width;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        // Create an instance of Shape
        Shape myShape = new Shape();

        // Call getArea method of Shape
        System.out.println("Calling getArea method of Shape:");
        double shapeArea = myShape.getArea();
        System.out.println("Area: " + shapeArea);

        // Create an instance of Rectangle
        Rectangle myRectangle = new Rectangle(5.0, 3.0);

        // Call getArea method of Rectangle (which overrides Shape's getArea)
        System.out.println("\nCalling getArea method of Rectangle:");
        double rectangleArea = myRectangle.getArea();
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
