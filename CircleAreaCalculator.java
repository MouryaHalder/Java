import java.util.Scanner;

class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        double area = circle.calculateArea();

        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        scanner.close();
    }
}
