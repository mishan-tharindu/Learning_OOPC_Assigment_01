package com.learning.overloading;

public class Man {


//    Same class same Methode different parameters
//    We using different parameters  same modethode name to overloading Methodes

    public static void main(String[] args) {

        startWalk();
        startEat();

        startWalk(5); // Calling Overloading Methode

    }

   public static void startWalk()
    {
        System.out.println("Start walking !!!");
    }

    public static void startWalk(int speed)
    {

//        Overload Walk Methode using integer parameter

        System.out.printf("Start walking "+speed+" speed !!!");
    }

    public static void startEat()
    {
        System.out.println("Start Eating !!!");
    }


}
