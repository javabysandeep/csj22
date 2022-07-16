package multithreading;

public class CounterDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                View.increaseCounter();
            }
        }, "thread1");

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                View.increaseCounter();
            }
        }, "thread2");
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Total views "+ View.viewCounter);

    }
}

class View {
    static int viewCounter = 0;

    static synchronized void increaseCounter() {
        viewCounter++;
    }
}