class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());

            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Task2 extends Thread {
    public Task2() {
        super("The Alien");
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());
        }
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Start: " + Thread.currentThread().getName());

        Task task = new Task();
        Thread t = new Thread(task, "MRT! The Alien");
        t.start();

        Thread.sleep(10000000L);

        /*Task2 t2 = new Task2();
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());
        }*/

        System.out.println("End: " + Thread.currentThread().getName());
    }
}