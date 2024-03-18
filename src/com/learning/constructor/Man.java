package com.learning.constructor;

public class Man {

    Man()
    {
//        Constructor means same name methode in same Class Name
//        Constructor calling every first time ib calling Man Object
//        Constructor hasn't return type

        System.out.println("Man Class Constructor !!!");
    }

    public static void main(String[] args) {
        Man man1 = new Man();
    }

}
