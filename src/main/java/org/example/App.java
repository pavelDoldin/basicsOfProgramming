package org.example;


import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        ex2();
    }

    public static void ex2(){
        /*
         * Напишите программу, которая проверяет.
         * Счастливый билет или нет и выводила результат.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер билета: ");
        int ticketNumber = scanner.nextInt();
        int theFirstThreeDigits = ticketNumber / 1000;
        int theSecondThreeDigits = ticketNumber % 1000;

        int secondNumber = ticketNumber / 100000;
        int firstDigit = ticketNumber / 10000 % 10;
        int thirdDigit = ticketNumber / 1000 % 10;

        int fourthDigit = ticketNumber / 100 % 10;
        int fifthDigit = ticketNumber / 10 % 10;
        int sixthDigit = ticketNumber % 10;

        int sumTheFirstThreeDigits = secondNumber + firstDigit + thirdDigit;
        int sumTheSecondThreeDigits = fourthDigit + fifthDigit + sixthDigit;
        if (theFirstThreeDigits == theSecondThreeDigits || sumTheFirstThreeDigits == sumTheSecondThreeDigits){
            System.out.println("Билет с номером " + ticketNumber + " счастливый.");
        } else {
            System.out.println("Билет с номером " + ticketNumber + " несчастливый.");
        }
    }
    public static void ex1(){
        /*
         *  Напишите программу, которая складывает, вычитает, умножает, делит два целых числа.
         *  И выводит результат.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите первое число: ");
        double firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextInt();
        double res1 = firstNumber + secondNumber;
        double res2 = firstNumber - secondNumber;
        double res3 = firstNumber * secondNumber;
        double res4 = firstNumber / secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + res1);
        System.out.println(firstNumber + " - " + secondNumber + " = " + res2);
        System.out.println(firstNumber + " * " + secondNumber + " = " + res3);
        System.out.println(firstNumber + " / " + secondNumber + " = " + res4);


    }
}

