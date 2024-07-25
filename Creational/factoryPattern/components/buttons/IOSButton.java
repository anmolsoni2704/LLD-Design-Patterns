package main.java.factoryPattern.components.buttons;

public class IOSButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing ios button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking ios button");
    }
}
