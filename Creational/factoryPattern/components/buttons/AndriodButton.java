package main.java.factoryPattern.components.buttons;

public class AndriodButton implements Button {
    @Override
    public void showButton() {
        System.out.println("Showing android button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking android button");
    }
}
