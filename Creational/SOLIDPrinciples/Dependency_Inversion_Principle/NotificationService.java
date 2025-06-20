package main.java.SOLIDPrinciples.Dependency_Inversion_Principle;

public class NotificationService {
    private final MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String name, String message) {
        sender.send(name, message);
    }
}
