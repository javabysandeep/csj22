package multithreading;

public class SleepDemo {
    public static void main(String[] args) {
        Runnable studyTask = ()->{
            for (int hour = 0; hour <5 ; hour++) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Studying: "+ Thread.currentThread().getName());
            }
        };
        Thread student = new Thread(studyTask,"ganesh");
        student.start();
    }
}
