package multithreading;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("pillar1");
        System.out.println("pillar2");
        System.out.println("pillar3");
        System.out.println("pillar4");

        // way 1. to implement interface
        Runnable runnable = new RunnableImpl();
        runnable.run();

        //2. use anonymous class
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous run method");
            }
        };
        runnable1.run();


        // way3: using lambda
        Runnable lambda = () -> System.out.println("lambda run method");
        lambda.run();

        // Thread class implements Runnable.
        // Child IS-A Parent
        Runnable thread = new Thread();

        Thread  task = new Task();
        Runnable taskRunnable = new Task();

    }
}
class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("run method");
    }
}

class Task extends Thread{}

