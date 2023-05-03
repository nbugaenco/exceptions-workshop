public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("Division by zero not allowed: " + e.getMessage() + "\n");
        } finally {
            System.out.println("This block will always execute, regardless of an exception.");
        }
    }
}
