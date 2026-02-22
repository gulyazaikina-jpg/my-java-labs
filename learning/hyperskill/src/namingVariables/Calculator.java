package namingVariables;
/**
 * Task: You are creating a basic calculator where the operator is the input.
 * Your user will input an operator sign defined as a single character: either '+' or '-'.
 * Your task will be to perform the operation on two fixed integers in your program, firstNum and secondNum, being their values 5 and 3 respectively.
*/
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        Scanner sc = new Scanner(System.in);

        char operator;

        while (true) {
            System.out.println("Enter an operator(+ or -):");
            String line = sc.nextLine().trim();  // remove gaps on the edges

            if(line.isEmpty()) {                 // nothing entered
                System.out.println("You entered nothing. Try again.");
                continue;
            }

            operator = line.charAt(0);           // take the first symbol

            if(operator == '+' || operator == '-') {
                break;
            }

            System.out.println("Invalid operator. Try again.");

            switch (operator) {
                case '+':
                    System.out.println((a + b));
                    break;

                case '-':
                    System.out.println((a - b));
                    break;

                default:
                    System.out.println("Invalid operator");
            }
        }
        sc.close();
    }
}