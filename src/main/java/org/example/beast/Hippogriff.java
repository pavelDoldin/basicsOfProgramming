package org.example.beast;

import java.util.Random;

public class Hippogriff {
    private String name;
    private int age;
    private String color;
    private String skill;

    public Hippogriff() {
    }

    public Hippogriff(String name) {
        this.name = name;
    }

    public Hippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Hippogriff(String name, int age, String color, String skill) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(String food) {

    }

    public String fly() {
        if (this.age <= 2) return String.format("%a: еще молод для полёта.", this.name);
        else return String.format("%a: взлетел.", this.name);
    }

    public String giveRide(Student student) {
        Random random = new Random();
        int isGivingRide = random.nextInt(11);
        if (isGivingRide == 1 || isGivingRide == 2 || isGivingRide == 3) {
            return student.getName() + " летит на " + this.name;
        } else if (isGivingRide == 9 || isGivingRide == 10) {
            return student.getName() + " попробуй снова, " + this.name + " не услышал тебя.";
        } else {
            return this.name + " не хочет лететь.";
        }
    }

}