package com.learning.interface_class.extending_interface;

interface Line
{
    void getLineName();
}

interface  Polygon extends Line
{
    void getPolygon();

}

public class Main {

    public static void main(String[] args) {
        Polygon p = new Polygon() {
            @Override
            public void getPolygon() {
                System.out.println("Methode getPolygon ");
            }

            @Override
            public void getLineName() {
                System.out.println("Methode Line ");
            }
        };
    }


}
