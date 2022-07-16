package multithreading.interThreadCommunication;

class Product {
    synchronized void produce() {
        System.out.println("Product is produced " + Thread.currentThread().getName());
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Rest of the produce");
    }

    synchronized void consume() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Product is consumed " + Thread.currentThread().getName());
        this.notify();
        System.out.println("Notified to the waiting thread");

    }
}