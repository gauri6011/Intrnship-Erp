public class AnonymousThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread running: " + i);
            }
        });
        t.start();
    }
}
