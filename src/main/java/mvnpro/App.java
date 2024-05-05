package mvnpro;

/**
 * This class contains methods for mathematical operations such as division and primality checking.
 */
public class App 
{

    /**
     * Divides two numbers.
     *
     * @param num1 The numerator.
     * @param num2 The denominator.
     * @return The result of the division.
     * @throws IllegalArgumentException if the denominator is zero.
     */
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    /**
     * Checks if a number is prime.
     *
     * @param number The number to check.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * The main method. This method is not used in this application.
     *
     * @param args The command line arguments.
     */
    public static void main( String[] args )
    {
    }
}
