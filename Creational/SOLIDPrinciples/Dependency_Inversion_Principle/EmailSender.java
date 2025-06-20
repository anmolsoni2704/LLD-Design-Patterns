package main.java.SOLIDPrinciples.Dependency_Inversion_Principle;

public class EmailSender implements MessageSender {
    @Override
    public void send(String name, String message) {
        System.out.println("Hey " + name + "," + message);
    }
}
