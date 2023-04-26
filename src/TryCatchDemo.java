public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Division by zero not allowed: " + e.getMessage());
        }
    }
}
