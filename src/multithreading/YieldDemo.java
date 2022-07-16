package multithreading;

public class YieldDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()-> System.out.println("Thread 1"), "thread1" );
        Thread thread2 = new Thread(()-> System.out.println("Thread 2"), "thread2" );
        Thread thread3 = new Thread(()-> System.out.println("Thread 3"), "thread3" );
        Thread thread4 = new Thread(()-> System.out.println("Thread 4"), "thread4" );

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread4.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        //thread1.start(); IllegalThreadStateException, if we try to call start method twice
        thread2.start();
        thread3.start();
        thread4.start();

        //yield
        Thread.yield();
        System.out.println("Main thread ");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
