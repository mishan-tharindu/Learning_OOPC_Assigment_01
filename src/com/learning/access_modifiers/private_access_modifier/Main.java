package com.learning.access_modifiers.private_access_modifier;

class Data {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
public class Main {

    public static void main(String[] args) {

        Data data = new Data();

//        Access private variable and feild form another Class
//        data.name = "Mishan";
//        We can't assign value like this because it private, Private means Private can access only in that class

//        We have solution, We can access it using getter and setters

        data.setName("This is Private Modifier Accessing option");
        System.out.println(data.getName());



    }
}
