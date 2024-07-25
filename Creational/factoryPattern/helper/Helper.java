package main.java.factoryPattern.helper;

import main.java.factoryPattern.AndroidFactory;
import main.java.factoryPattern.IOSFactory;
import main.java.factoryPattern.UIFactory;
import main.java.factoryPattern.constants.Platform;

public class Helper {
    public static UIFactory getUIFactoryForPlatform(Platform platform){
        if(platform.equals(Platform.IOS)){
            return new IOSFactory();
        }else if(platform.equals(Platform.ANDROID)){
            return new AndroidFactory();
        }else{
            throw new RuntimeException("Invalid platform");
        }
    }
}
/*
Constant and keywords

 */
