package main.java.factoryPattern;

import main.java.factoryPattern.components.buttons.AndriodButton;
import main.java.factoryPattern.components.buttons.Button;
import main.java.factoryPattern.components.dropdowns.AndriodDropDown;
import main.java.factoryPattern.components.dropdowns.DropDown;
import main.java.factoryPattern.components.menus.AndriodMenu;
import main.java.factoryPattern.components.menus.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndriodButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndriodDropDown();
    }

    @Override
    public Menu createMenu() {
        return new AndriodMenu();
    }
}
