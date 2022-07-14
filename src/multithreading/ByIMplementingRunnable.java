package multithreading;

public class ByIMplementingRunnable {
    public static void main(String[] args) {
        /*// We have created class that implements Runnable and run method is overridden with the lambda
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
        //creation of thread by passing name and job of the thread
        Thread thread = new Thread(runnable, "worker");
        thread.start();*/

        new Thread(() ->
                System.out.println(Thread.currentThread().getName()), "worker")
                .start();
    }
}


