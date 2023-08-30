public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        // Extract each digit and print in reverse order
        int digit4 = number % 10;
        int digit3 = (number / 10) % 10;
        int digit2 = (number / 100) % 10;
        int digit1 = (number / 1000) % 10;

        System.out.print("Reversed number: ");
        System.out.print(digit4);
        System.out.print(digit3);
        System.out.print(digit2);
        System.out.println(digit1);

        scanner.close();
    }
}
