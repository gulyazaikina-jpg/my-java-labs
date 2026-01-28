/** Task:
 * You are given a number as the input.
 * Your task is to determine whether it is a positive integer, negative integer, zero or a non-integer.
 * If the integer is positive, print 'positive'.
 * If it is negative, print 'negative'.
 * If the integer is zero, print 'zero'.
 * If it is a non-integer, print 'non-integer'. */

package DetermineTheTypeOfTheInputNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextDouble()){                    // not even a number
            System.out.println("non-integer");
            return;
        }

        double x = sc.nextDouble();

        // Check if it's one integer value
        if (x % 1 != 0) {
            System.out.println("non-integer");
        }
        else {
            long n = (long) x;
            if (n > 0) System.out.println("positive");
            else if (n < 0) System.out.println("negative");
            else System.out.println("zero");
        }
        sc.close();
    }
}
