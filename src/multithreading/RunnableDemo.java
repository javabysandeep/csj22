package multithreading;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Runnable via lambda run method "+Thread.currentThread().getName());
        };
//        runnable.start();
//        runnable.run();
        Thread thread = new Thread(runnable,"Runnable");
        thread.start();
//        thread.setName("runnable");

        System.out.println("Main thread");
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
