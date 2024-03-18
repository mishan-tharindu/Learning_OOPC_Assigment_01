package com.learning.Inheritance.methode_overriding_JavaInheritance;

class Animal
{

    public void eat()
    {
        System.out.println("I can Eat");
    }

}

class Dog extends Animal
{
    @Override
    public void eat() {

//        Class Super Class Eat Methode
        super.eat();

        System.out.println("I eat dog Food");
    }

    public void bark(){
        System.out.println("I can bark");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

    }
}
