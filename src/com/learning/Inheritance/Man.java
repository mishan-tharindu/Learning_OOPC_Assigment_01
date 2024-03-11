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

//Common Ewa tiyenne Super Class ake
//Sub class ake tiyenne speacific dewal

//inheritance is a mechanism that allows a class to inherit properties and behaviors from another classs