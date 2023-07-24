package task3;

public class main {

public static void main(String[] args) {
    // Creating instances of the subclasses
    Rectangle rectangle = new Rectangle(4, 5);
    Circle circle = new Circle(3);
    Triangle triangle = new Triangle(3, 4, 5);

    // Calculating and printing the area and perimeter of each shape
    System.out.println("Rectangle:");
    System.out.println("Area: " + rectangle.calculateArea());
    System.out.println("Perimeter: " + rectangle.calculatePerimeter());

    System.out.println("\nCircle:");
    System.out.println("Area: " + circle.calculateArea());
    System.out.println("Perimeter: " + circle.calculatePerimeter());

    System.out.println("\nTriangle:");
    System.out.println("Area: " + triangle.calculateArea());
    System.out.println("Perimeter: " + triangle.calculatePerimeter());
}
}
