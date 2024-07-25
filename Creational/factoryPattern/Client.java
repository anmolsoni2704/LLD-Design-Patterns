package main.java.factoryPattern;

import main.java.factoryPattern.components.buttons.Button;
import main.java.factoryPattern.components.dropdowns.DropDown;
import main.java.factoryPattern.constants.Platform;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Platform.ANDROID);

        Button button = uiFactory.createButton();
        DropDown dropdown = uiFactory.createDropDown();
        button.clickButton();
        button.showButton();

        dropdown.showDropDown();
    }
}
