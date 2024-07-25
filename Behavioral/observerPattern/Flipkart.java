package main.java.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance;
    private final List<OrderPlacedSubscriber> orderPlacedSubscriberList = new ArrayList<>();

    public static Flipkart getInstance() {
        if(instance == null){
            instance = new Flipkart();
        }
        return instance;
    }

    void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.add(orderPlacedSubscriber);
    }

    void unregisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.remove(orderPlacedSubscriber);
    }

    public void orderPlaced() {
        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscriberList){
            orderPlacedSubscriber.announceOrderPlaced();
        }
    }
}
