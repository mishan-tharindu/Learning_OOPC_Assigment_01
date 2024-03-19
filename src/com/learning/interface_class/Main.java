package com.learning.interface_class;

interface Polygon
{
    void getArea(int length, int breadth);
}

class Rectangle implements Polygon
{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("This area of the rectangle is "+(length * breadth));
    }
}

public class Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);

    }
}

/*
*

An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).

We use the interface keyword to create an interface in Java.

*
* */