package exceptions;

public class FibonacciException extends RuntimeException {
    public FibonacciException(int n) {
        super("Tried to Fibonacci with n = " + n);
    }

}
