
public class Main {
    public static void main(String[] args) {
        System.out.println("Start: " + Thread.currentThread().getName());

        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + ": " + Thread.currentThread().getName());
                }
            }
        };

        Thread t = new Thread(target);
        t.start();

        System.out.println("End: " + Thread.currentThread().getName());
    }
}