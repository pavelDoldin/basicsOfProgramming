package org.example.beast;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Hippogriff hippogriff1 = new Hippogriff("BMV", "красный");
        Hippogriff hippogriff2 = new Hippogriff("Vaz");
        Hippogriff hippogriff3 = new Hippogriff("Fiat", 3, "белый", "умный");
        Hippogriff hippogriff4 = new Hippogriff();
        hippogriff4.setName("Друг");

        Student student = new Student("Pavel", "developer", 37, "a");

        System.out.println(hippogriff1.giveRide(student));
    }
}
