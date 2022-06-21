package oops.abstraction;

class MessageServiceImpl extends MessageService{
    @Override
    void sendMessage(String message) {
        System.out.println("Sending message");
    }
}