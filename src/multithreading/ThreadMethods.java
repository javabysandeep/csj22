package multithreading;

public class ThreadMethods {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> System.out.println("run method"),"thread");
        //IllegalArgumentException: if we specify thread priority out of range, 1-10
        //thread.setPriority(11);
        thread.start();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.getId());
    }
}
