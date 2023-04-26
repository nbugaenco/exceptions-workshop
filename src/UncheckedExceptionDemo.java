// Unchecked exception (runtime exception, no need to handle or declare)
public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]); // Throws ArrayIndexOutOfBoundsException
    }
}