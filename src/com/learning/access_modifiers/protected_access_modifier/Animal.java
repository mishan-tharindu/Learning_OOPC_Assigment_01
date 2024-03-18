package com.learning.access_modifiers.protected_access_modifier;

public class Animal {

    protected void display()
    {
        System.out.println("This is Animal Class");
    }

}

class Dog extends Animal
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}

