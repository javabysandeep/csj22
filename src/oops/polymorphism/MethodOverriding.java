package oops.polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("Parent class");
    }
}
