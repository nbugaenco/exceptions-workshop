public class ExceptionMethodsDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Exception message: " + e.getMessage()); // Returns the detail message string of the exception.
            System.err.println("\nException type: " + e.getClass() + "\n"); // Returns the runtime class of the exception object.
            e.printStackTrace(); // Prints the exception and its backtrace to the standard error stream.
        }
    }
}
