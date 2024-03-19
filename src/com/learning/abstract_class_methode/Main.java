package com.learning.abstract_class_methode;

abstract class MotorBike
{
    abstract void brake();

}

class SportBike extends MotorBike
{
    public void brake()
    {
        System.out.println("SportsBike Brake");
    }
}

class MountainBike extends MotorBike
{

    public void brake()
    {
        System.out.println("MountainBike Brake");
    }

}
public class Main {

    public static void main(String[] args) {
        MountainBike bike1 = new MountainBike();
        bike1.brake();
        SportBike bike2 = new SportBike();
        bike2.brake();
    }

}

/*
*
*
*

Java Abstraction

* The major use of abstract classes and methods is to achieve abstraction in Java.
* Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary details and only show the needed information.
* This allows us to manage complexity by omitting or hiding details with a simpler, higher-level idea.
* A practical example of abstraction can be motorbike brakes. We know what brake does. When we apply the brake, the motorbike will stop.
However, the working of the brake is kept hidden from us.
* The major advantage of hiding the working of the brake is that now the manufacturer can implement brake differently for different motorbikes,
however, what brake does will be the same.


*
*
*


Key Points to Remember

* We use the abstract keyword to create abstract classes and methods.
* An abstract method doesn't have any implementation (method body).
* A class containing abstract methods should also be abstract.
* We cannot create objects of an abstract class.
* To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
* A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
* We can access the static attributes and methods of an abstract class using the reference of the abstract class. For example,


* */
