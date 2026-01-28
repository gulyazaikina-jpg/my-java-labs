package arithmetic;
/**
 * Task: Write a program that reads two integers from the user using Scanner, calculates their sum, and prints the result.
 * The first input represents the number of apples, and the second input represents the number of oranges.
 * The output should display the total number of fruits.
 */
import java.util.Scanner;

public class TotalFruits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int apple = sc.nextInt();
        int orange = sc.nextInt();
        int totalFruits = (apple + orange);

        System.out.println(totalFruits);

        sc.close();
    }
}