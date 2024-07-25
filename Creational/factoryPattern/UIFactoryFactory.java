package main.java.factoryPattern;

import main.java.factoryPattern.constants.Platform;

public class UIFactoryFactory {
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
