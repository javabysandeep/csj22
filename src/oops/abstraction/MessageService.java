package oops.abstraction;

abstract class MessageService {
    //    abstract  void m2();
    int instanceVar = 100;

    void m1() {
        System.out.println("m1 method");
    }

    public MessageService() {
        System.out.println("Abstract class constructor");
    }

    {
        System.out.println("instance block inside the AC");
    }

    static {
        System.out.println("static block inside the AC");
    }

    abstract void sendMessage(String message);
}