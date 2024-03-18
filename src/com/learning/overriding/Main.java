package com.learning.overriding;

class Animal
{

    public void displayInfo()
    {
        System.out.println("I'm an Animal.");
    }

}

class  Dog extends Animal
{

    @Override
    public void displayInfo() {
        //Calling Super Class function
        super.displayInfo();
        System.out.println("I am a Dog.");
    }
}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayInfo();
    }

}
