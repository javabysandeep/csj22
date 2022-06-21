package oops.abstraction.interfaceDemos;

class MessageServiceImpl implements MessageService, PushMessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending normal message");
    }

    @Override
    public void pushMessage() {
        System.out.println("sending push message");
    }
}