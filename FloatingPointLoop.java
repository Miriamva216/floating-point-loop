import java.util.Scanner;

public class FloatingPointLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        int count = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        while (count < 5) {
            System.out.print("Enter floating-point number " + (count + 1) + ": ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                total += value;

                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }

                count++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
                scanner.next(); // clear the invalid input
            }
        }

        double average = total / 5;
        double interest = total * 0.20;

        System.out.println("\nTotal: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close();
    }
}

