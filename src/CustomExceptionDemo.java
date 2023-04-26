// Custom exception
class ComingOfAgeException extends Exception {
    // Default constructor
    public ComingOfAgeException() {
        super("Coming of age exception occurred");
    }

    // Constructor with custom message
    public ComingOfAgeException(String message) {
        super(message);
    }

    // Constructor with custom message and cause
    public ComingOfAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor with cause
    public ComingOfAgeException(Throwable cause) {
        super(cause);
    }
}

// Demo class
public class CustomExceptionDemo {
    public static void validateAge(int age) throws ComingOfAgeException {
        if (age < 18) {
            throw new ComingOfAgeException("Age must be 18 or older");
        } else {
            System.out.println("Age validation passed.");
        }
    }

    public static void main(String[] args) {
        // Using custom message constructor
        try {
            validateAge(15);
        } catch (ComingOfAgeException e) {
            System.err.println("Custom Exception: " + e.getMessage() + "\n");
        }

        // Using default constructor
        try {
            throw new ComingOfAgeException();
        } catch (ComingOfAgeException e) {
            System.err.println("Custom Exception: " + e.getMessage() + "\n");
        }

        // Using custom message and cause constructor
        try {
            Throwable cause = new IllegalArgumentException("Invalid age");
            throw new ComingOfAgeException("Age must be a positive number", cause);
        } catch (ComingOfAgeException e) {
            System.err.println("Custom Exception: " + e.getMessage());
            System.err.println("Cause: " + e.getCause() + "\n");
        }

        // Using cause constructor
        try {
            Throwable cause = new NumberFormatException("Invalid age format");
            throw new ComingOfAgeException(cause);
        } catch (ComingOfAgeException e) {
            System.err.println("Custom Exception: " + e.getMessage());
            System.err.println("Cause: " + e.getCause());
        }
    }
}
