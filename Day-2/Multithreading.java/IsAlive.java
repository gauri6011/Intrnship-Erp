class IsAlive extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        IsAlive t = new IsAlive();  

        System.out.println("Before start: " + t.isAlive());

        t.start();  

        System.out.println("After start: " + t.isAlive()); 
    }
}
