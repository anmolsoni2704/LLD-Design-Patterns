package main.java.factoryPattern;

import main.java.factoryPattern.components.buttons.Button;
import main.java.factoryPattern.components.dropdowns.DropDown;
import main.java.factoryPattern.components.menus.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
