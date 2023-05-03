class AutoCloseableResource implements AutoCloseable {
    private final String resourceName;

    public AutoCloseableResource(String resourceName) {
        this.resourceName = resourceName;
        System.out.println("\033[0;33m" + resourceName + " opened." + "\033[0m");
    }

    public void useResource(boolean throwException) {
        System.out.println("\033[0;35m" + "Using " + resourceName + "\033[0m");
        if (throwException) {
            throw new IllegalStateException("Cannot use " + resourceName);
        }
    }

    @Override
    public void close() {
        System.out.println("\033[0;34m" + resourceName + " closed." + "\033[0m");
    }
}

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try (AutoCloseableResource resource1 = new AutoCloseableResource("Resource1");
             AutoCloseableResource resource2 = new AutoCloseableResource("Resource2")) {

            System.out.println();
            resource1.useResource(false);
            resource2.useResource(true);

            System.out.printf("\033[1;32m%nResources are being used.%n\u001B[0m%n");

        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        } finally {
            System.out.println("\nFinally block executed.");
        }
    }
}
