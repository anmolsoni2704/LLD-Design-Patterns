package main.java.observerPattern;

public class AnalyticsSender implements OrderPlacedSubscriber{

    public AnalyticsSender() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public ReturnData announceOrderPlaced() {
        System.out.println("Updating analytics");
        return null;
    }
}
