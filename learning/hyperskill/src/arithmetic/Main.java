package arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));

        if (num2 == 0) {
            System.out.println("Error: Cannot calculate quotient because the divisor is zero.");
        } else {
            System.out.println("Quotient: " + ((double) num1 / num2));
        }

        scanner.close();
    }
}


