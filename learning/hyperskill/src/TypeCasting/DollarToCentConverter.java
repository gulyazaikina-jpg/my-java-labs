package TypeCasting;

/**Task: You need to create a program that converts dollars to cents.
 * The program should take a double value for dollars and print the equivalent amount in cents as an integer.
 */
public class DollarToCentConverter {
    public static void main(String [] args) {
        double dollars = 10.999;
        int cents = (int) Math.round(dollars * 100);
        System.out.println(cents + " cents");

    }
}
