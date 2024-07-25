package main.java.decoratorPattern;

public class Client {
    public static void main(String[] args) {
        IceCreamConeConstituents iceCreamConeConstituents = new Chocochips(new ChocolateCone(new VanillaScoop(new ChocolateCone(new StrawberryScoop(new OrangeCone())))));

        System.out.println(iceCreamConeConstituents.getDescription());
        System.out.println(iceCreamConeConstituents.getCost());
    }
}
