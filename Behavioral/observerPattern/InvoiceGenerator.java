package main.java.observerPattern;

public class InvoiceGenerator implements OrderPlacedSubscriber{

    public InvoiceGenerator() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public ReturnData announceOrderPlaced() {
        System.out.println("Generating invoice");
        return null;
    }
}
