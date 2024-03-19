package com.learning.interface_class.implementing_multiple_interfaces;

interface A{

     void getMethodeA();

}

interface B{

    void getMethodeB();

}

class C implements A,B{

    @Override
    public void getMethodeB() {
        System.out.println("This is B Class Methode");
    }

    @Override
    public void getMethodeA() {
        System.out.println("This is A Class Methode");
    }
}

public class Main{

    public static void main(String[] args) {
        C c = new C();
        c.getMethodeA();
        c.getMethodeB();
    }
}


/*
*
*
*
* * * * * * In Java, a class can also implement multiple interfaces.
*
*
*
* */