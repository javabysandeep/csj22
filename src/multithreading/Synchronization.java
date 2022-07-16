package multithreading;

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Data data = new Data();
        Thread thread2 = new Thread(()-> {
            data.receiveData();

        }, "thread2");

        Thread thread1 = new Thread(()-> {
            try {
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data.saveData();
        }, "thread1");
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Main thread");
    }
}
class Data{
    synchronized void saveData()  {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Send Data "+ Thread.currentThread().getName());
    }
    synchronized void receiveData(){
        System.out.println("Receive Data "+ Thread.currentThread().getName());
    }
}
