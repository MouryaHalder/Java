import java.util.Scanner;
//18 28
public class FindLargestAmong3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Finding the largest number
        double largest = FindLargestAmong3(num1, num2, num3);

        // Displaying the result
        System.out.println("The largest number among " + num1 + ", " + num2 +
                           ", and " + num3 + " is: " + largest);

        scanner.close();
    }

    // Method to find the largest number
    private static double FindLargestAmong3(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }
}
