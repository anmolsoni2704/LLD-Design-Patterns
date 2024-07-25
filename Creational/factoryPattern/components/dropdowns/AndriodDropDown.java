package main.java.factoryPattern.components.dropdowns;

public class AndriodDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("Showing android dropdown");
    }

    @Override
    public void collapse() {
        System.out.println("Collapse android dropdown");
    }
}