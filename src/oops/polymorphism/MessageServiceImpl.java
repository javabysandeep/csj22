package oops.polymorphism;

public class MessageServiceImpl extends MessageService {
    void sendMessage() {
        System.out.println("Sending message with whatsApp");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message with WhatsApp");
    }
}
