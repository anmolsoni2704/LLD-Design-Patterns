package main.java.factoryPattern;

import main.java.factoryPattern.components.buttons.Button;
import main.java.factoryPattern.components.buttons.IOSButton;
import main.java.factoryPattern.components.dropdowns.DropDown;
import main.java.factoryPattern.components.dropdowns.IOSDropDown;
import main.java.factoryPattern.components.menus.IOSMenu;
import main.java.factoryPattern.components.menus.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
