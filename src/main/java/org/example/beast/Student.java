package org.example.beast;

import java.util.Arrays;

public class Student {
    private String name;
    private String faculty;
    private int age;
    private String skill;

    public Student(String name, String faculty, int age, String skill) {
        this.name = name;
        this.faculty = faculty;
        this.age = age;
        this.skill  = skill;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getAge() {
        return age;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", age=" + age +
                ", skill=" + skill +
                '}';
    }
}
