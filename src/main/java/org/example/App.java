package org.example;


import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        //System.out.println( "Hello World!" );
        ex6();
    }
    public static void ex6(){
        /**
         * Первое задание
         * Создайте, строку из 5 случайных чисел new Random().nextInt().
         * Замените все единицы на символ ‘i’.
         * У получившейся строки уберите все символы ‘-’
         * У получившейся строки замените все нули на символ ‘o’.
         * У получившейся строки замените все шестерки на символ ‘b’.
         * Выведите результат в консоль.
         * Узнайте, содержится ли подстрока “23” у получившейся строки.
         * Узнайте индекс подстроки “ob”.
         */
        Random random = new Random();
        int number1 = random.nextInt();
        int number2 = random.nextInt();
        int number3 = random.nextInt();
        int number4 = random.nextInt();
        int number5 = random.nextInt();

        String fromNumberToString = String.valueOf(number1) + String.valueOf(number2) + String.valueOf(number3) +
                String.valueOf(number4) + String.valueOf(number5);
        System.out.println(fromNumberToString);
        String i = fromNumberToString.replaceAll("1", "i");
        String del = i.replaceAll("-", "");
        String o =del.replaceAll("0", "o");
        String b = o.replaceAll("6", "b");
        System.out.println(b);
        System.out.println(b.contains("23"));
        System.out.println(b.indexOf("ob"));

    }
    public static void ex5(){
        /**
         * Получить остатки от деления на 13, 14, 15, 16, 17, 19 числа 4199. Затем вычислить сумму остатков от деления.
         */
        final int number = 4199;
        double result1 = number % 13;
        double result2 = number % 14;
        double result3 = number % 15;
        double result4 = number % 16;
        double result5 = number % 17;
        double result6 = number % 19;
        double result = result1 + result2 + result3 + result4 + result5 + result6;
        System.out.println(result);
    }
    public static void ex4(){
        /**
         * С помощью new Random().nextInt(1, 10) сгенерируйте 2 разных числа grade1, grade2. Обратите внимание,
         * что класс Random вообще призван, чтобы всегда генерировать случайное число. Тут мы указали конкретный
         * диапазон, потому что работу можно оценить от 1 до 10. Но можно диапазон и не указывать. Каждый раз,
         * когда мы будем вызывать этот метод, будет генерироваться новое число.
         * Теперь давайте проверим, что оба числа больше 5 — это приемлемая для сдачи работы оценка.
         * Используем операции сравнения и &&, чтобы выполнить две проверки на одной строчке.
         * Результат выполнения записываем в переменную типа boolean c названием result.
         * Затем выводим result на экран. Так, если оба числа были больше 5, в результате мы должны получить true.
         * Чтобы проверить, какими были числа, можно перед операцией сравнения тоже вывести их на экран.
         * Затем посчитаем средний балл: сложим две оценки и разделим на два. Подумайте,
         * какой тип данных может получиться в итоге? Результат также вывести на экран.
         */
        Random random = new Random();
        int grade1 = random.nextInt(10);
        int grade2 = random.nextInt(10);
        int number = 5;
        boolean result = grade1 > number && grade2 > number;
        double average = (double) (grade1 + grade2) / 2;
        System.out.println(grade1);
        System.out.println(grade2);
        System.out.println(result);
        System.out.println(average);

    }
    public static void ex3(){
        /**
         *  Создайте 5 переменных типа String: dumbledore, mcgonagall, snape, lupin, hugrid.
         *  Присвойте каждой переменной значение, соответствующее ее названию. Должны получиться поля,
         *  содержащие имена знаменитых волшебников.
         * Затем создайте еще одну строку с названием teachers, содержащую текст: “School teachers:“.
         * Обратите внимание, в тексте содержится двоеточие.
         * Выведите на экран сначала строку teachers, затем все 5 строк с именами преподавателей.
         * Должен получиться список учителей.
         */

        String dumbledore = "dumbledore";
        String mcgonagall = "mcgonagall";
        String snape = "snape";
        String lupin = "lupin";
        String hugrid = "hugrid";
        String teachers = "School teachers:";
        System.out.println(teachers);
        System.out.println(dumbledore);
        System.out.println(mcgonagall);
        System.out.println(snape);
        System.out.println(lupin);
        System.out.println(hugrid);

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

