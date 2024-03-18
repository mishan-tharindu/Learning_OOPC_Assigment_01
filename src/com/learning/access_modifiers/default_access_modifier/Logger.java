package com.learning.access_modifiers.default_access_modifier;

class Test_Logger {

    public static void main(String[] args) {
        Logger logger = new Logger();
        Logger.message_default();
    }

}

public class Logger {

    static void message_default()
    {
        System.out.println("Default Access Modifier !!!");
    }


    /*
    *
    * Here, the Logger class has the default access modifier. And the class is visible to all the classes that belong to the defaultPackage package.
    * However, if we try to use the Logger class in another class outside of defaultPackage, we will get a compilation error.
    *
    *
    * */


}


