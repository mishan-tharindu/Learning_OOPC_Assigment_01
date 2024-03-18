package com.learning.Inheritance.protected_members;

class Animal
{

    protected String name;

    public void eat()
    {
        System.out.println("I can Eat");
    }

    protected void display()
    {
        System.out.println("I am Animal");
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

    public void getInfo(){
        System.out.println("My Name is "+name);
    }
}

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Akira";
        dog.eat();
        dog.bark();
        dog.display();
        dog.getInfo();

    }
}


/*
*
* Why use inheritance?
*
The most important use of inheritance in Java is code reusability. The code that is present in the parent class can be directly
used by the child class.
*
Method overriding is also known as runtime polymorphism. Hence, we can achieve Polymorphism in Java with the help of inheritance.
*
* */