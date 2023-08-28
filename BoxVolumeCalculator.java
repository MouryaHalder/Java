//Overloading Constructor Box & calculate volume

import java.util.*;

class Box {
    private double length;
    private double width;
    private double height;

    // Constructor with no parameters
    public Box() {
        length = 1.0;
        width = 1.0;
        height = 1.0;
    }

    // Constructor with one parameter (for a cube)
    public Box(double side) {
        length = side;
        width = side;
        height = side;
    }

    // Constructor with three parameters
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return length * width * height;
    }
}

public class BoxVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of box:");
        System.out.println("1. Default box");
        System.out.println("2. Cube");
        System.out.println("3. Custom box");

        int choice = scanner.nextInt();

        double volume;

        if (choice == 1) {
            Box defaultBox = new Box();
            volume = defaultBox.calculateVolume();
        } else if (choice == 2) {
            System.out.print("Enter the side length of the cube: ");
            double side = scanner.nextDouble();
            Box cube = new Box(side);
            volume = cube.calculateVolume();
        } else {
            System.out.print("Enter the length of the box: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the box: ");
            double width = scanner.nextDouble();
            System.out.print("Enter the height of the box: ");
            double height = scanner.nextDouble();
            Box customBox = new Box(length, width, height);
            volume = customBox.calculateVolume();
        }

        System.out.println("The volume of the box is: " + volume);

        scanner.close();
    }
}
