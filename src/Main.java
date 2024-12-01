class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());
        }
    }
}

class Task2 extends Thread {
    public Task2() {
        super("The Alien");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Start: " + Thread.currentThread().getName());

        Task task = new Task();
        Thread t = new Thread(task, "MRT! The Alien");
        t.start();

        Task2 t2 = new Task2();
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());
        }

        System.out.println("End: " + Thread.currentThread().getName());
    }
}