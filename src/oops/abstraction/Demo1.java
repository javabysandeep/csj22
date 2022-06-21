package oops.abstraction;

public class Demo1 {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("hello");
    }
}


