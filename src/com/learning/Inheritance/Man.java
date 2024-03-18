package com.learning.Inheritance;

public class Man {

    String name;
    String age;
    String skinColor;

    Man()
    {
        System.out.printf("Man Constructor !!");
    }

    public static void startWalk()
    {
        System.out.println("Starting Walk !!!");
    }

    public static void startEats()
    {
        System.out.println("Starting Eats !!! ");
    }

    public static void startRun()
    {
        System.out.println("Strat runing !!!");
    }
    //

}

class Man_MT extends Man
{

    public static void main(String[] args) {
        Man man01 = new Man();
    }

    public static void startCode()
    {
        System.out.println("Starting Codeing !!!");
    }

}
// Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.

//Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.

//Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.

//Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the
// existing class when you create a new class. You can use the same fields and methods already defined in the previous class.



//Common Ewa tiyenne Super Class ake
//Sub class ake tiyenne speacific dewal

//inheritance is a mechanism that allows a class to inherit properties and behaviors from another classs

