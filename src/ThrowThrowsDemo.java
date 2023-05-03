public class ThrowThrowsDemo {

    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(1000);
        throw new InterruptedException("Interrupted");
    }
}
