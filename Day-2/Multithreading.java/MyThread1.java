class MyThread1 extends Thread {
    public void run() {
        System.out.println("Child Thread is running...");
    }

    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.start();  

        System.out.println("Main Thread is running...");
    }
}

