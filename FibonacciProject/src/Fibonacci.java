/**
 * Software Development II CEN-4025C *Assignment 2 *Eclipse ide Version: 2023-03
 * *Build id: 20230309-1520
 * 
 * @author RTL
 **/
public class Fibonacci {
    public static int fibonacci(int n) {
	if (n <= 1) {
	    return n;
	} else {
	    return fibonacci(n - 1) + fibonacci(n - 2);
	}
    }

    public static void main(String[] args) {
	int n = 10;
	int result = fibonacci(n);
	System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
