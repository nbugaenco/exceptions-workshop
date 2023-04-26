public class CatchSpecificExceptionFirst {

    public static void doSomething(String input) throws IllegalArgumentException, NumberFormatException {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        int number = Integer.parseInt(input); // This can throw a NumberFormatException
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        // Incorrect order of catch blocks (unreachable catch block)
        try {
            doSomething("InvalidNumber");
        } catch (IllegalArgumentException e) { // This catch block is too general
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } /*catch (NumberFormatException e) { // This catch block becomes unreachable
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        }*/

        // Correct order of catch blocks
        try {
            doSomething("InvalidNumber");
        } catch (NumberFormatException e) { // Most specific exception caught first
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }
}
