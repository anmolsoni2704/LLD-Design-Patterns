package main.java.observerPattern;

public class EmailSender implements OrderPlacedSubscriber{

    public EmailSender() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public ReturnData announceOrderPlaced() {
        System.out.println("Sending e-mail");
        return null;
    }
}
