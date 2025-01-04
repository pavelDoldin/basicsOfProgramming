package org.example;

public class Dragon {

    String name;
    int age;
    String color;
    boolean isFireBreathing;

    public Dragon(){

    }
    public Dragon(String name, int age, String color, boolean isFireBreathing) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isFireBreathing = isFireBreathing;
    }

    public String getName() {
        return name;
    }

    public void roar(){
        System.out.println("Rooorrr!");
    }
}
