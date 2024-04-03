package com.learning.polymorphism;

class Polygon{

    public void render()
    {
        System.out.println("Rendering Polygon ... ");
    }

}

class Square extends Polygon{

    public void render()
    {
        System.out.println("Rendering Square ... ");
    }

}

class Circle extends Polygon{

//    render Circle
    public void render()
    {
        System.out.println("Render Circle ...");
    }

}


public class Main {

    public static void main(String[] args) {

        Square s1 = new Square();
        s1.render();

        Polygon p = new Square();
        p.render();


    }

}
