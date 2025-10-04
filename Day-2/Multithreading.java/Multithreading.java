class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(600); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start(); 
        t2.start(); 
    }
}
