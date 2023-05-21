/**
 * Software Development II CEN-4025C *Assignment 2 *Eclipse ide Version: 2023-03
 * *Build id: 20230309-1520
 * 
 * @author RTL
 **/
/**
 * This method calculates the nth term of the Fibonacci sequence recursively.
 *
 * @param n The position in the Fibonacci sequence to calculate. Should be a
 *          non-negative integer.
 * @return The nth term of the Fibonacci sequence.
 */
public class Fibonacci {
    public static int fibonacci(int n) {
	if (n <= 1) {
	    return n;
	} else {
	    return fibonacci(n - 1) + fibonacci(n - 2);
	}
    }

    /**
     * This is the main method which serves as the entry point for the program.
     * 
     * It calls the fibonacci method with 10 as an argument and prints out the 10th
     * term of the Fibonacci sequence in the following format: "The nth term of the
     * Fibonacci sequence is y." where n is the term number and y is the value of
     * that term in the Fibonacci sequence.
     * 
     * @param args An array of command-line arguments for the application
     */
    public static void main(String[] args) {
	int n = 10;
	int result = fibonacci(n);
	System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + "!");
    }
}
