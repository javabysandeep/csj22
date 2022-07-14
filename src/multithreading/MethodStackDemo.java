package multithreading;

public class MethodStackDemo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setName("worker");
        worker.start();


        System.out.println("Main thread");
        m1();
        System.out.println(Thread.currentThread().getName());
    }

    private static void m1() {
        System.out.println("m1 " + Thread.currentThread().getName());
    }

    private static class Worker extends Thread {
        @Override
        public void run() {
            System.out.println("run method " + Thread.currentThread().getName());
            m1();
        }
    }
}
