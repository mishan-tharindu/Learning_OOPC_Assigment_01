package com.learning.Inheritance.java_inheritance;

class Animal
{
    String name;

    public void eat()
    {
        System.out.println("I can Eat");
    }

}

class Dog extends Animal
{

    public void display()
    {
        System.out.println("My Name is "+name);
    }


}

public class Main {

    public static void main(String[] args) {

        Dog labrador = new Dog();

        labrador.name = "Akira";
        labrador.display();

        labrador.eat();

    }
}
