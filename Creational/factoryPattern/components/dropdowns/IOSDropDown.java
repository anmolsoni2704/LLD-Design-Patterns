package main.java.factoryPattern.components.dropdowns;

public class IOSDropDown implements DropDown{
    @Override
    public void showDropDown() {
        System.out.println("Showing ios dropdown");
    }

    @Override
    public void collapse() {
        System.out.println("Collapse ios dropdown");
    }
}
