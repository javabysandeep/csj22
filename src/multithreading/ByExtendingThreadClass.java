package multithreading;

public class ByExtendingThreadClass {
    public static void main(String[] args) {
        ThreadTask thread = new ThreadTask();
        thread.setName("custom");
        thread.run();

        System.out.println("Main thread ");
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class ThreadTask extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
