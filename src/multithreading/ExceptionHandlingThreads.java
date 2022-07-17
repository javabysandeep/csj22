package multithreading;

import exceptionHandling.InvalidNumberException;

public class ExceptionHandlingThreads {
    public static void main(String[] args) {
        Thread tableThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(21 * i + " " + Thread.currentThread().getName());
            }
        }, "table");
        tableThread.start();

        System.out.println("main thread");
        for (int i = 1; i <= 10; i++) {
            System.out.println(21 * i + " " + Thread.currentThread().getName());
            if (i == 5) {
                throw new ArithmeticException();
            }
        }
    }
}
