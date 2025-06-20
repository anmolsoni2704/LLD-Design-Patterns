package main.java.SOLIDPrinciples.Dependency_Inversion_Principle;

public class Client {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new EmailSender());
        notificationService.notifyUser("Anmol", "Your parcel is dispatched");
    }
}
