package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Point {
    public void prepare (){
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] ingredients = {"Драконий коготь, Лист мандрагоры, Корень шершавой астрелии."};
        System.out.println(Arrays.toString(ingredients));
        System.out.println("Добро пожаловать в лабораторию зелий!");
        System.out.println("Введите ингредиенты, которые у вас есть (через запятую):");
        input = scanner.nextLine();
        String[] userIngredients = input.split(", ");
        System.out.println(Arrays.toString(userIngredients));
    }
}
