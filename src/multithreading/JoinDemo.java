package multithreading;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(runnable, "thread1");
        thread.start();

        // main thread to wait till thread1 completes the execution
        System.out.println("main thread");
        thread.join(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
