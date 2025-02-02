package org.example;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //System.out.println( "Hello World!" );
        //Quidditch quidditch = new Quidditch();
        //quidditch.getBalls();
        //quidditch.playGame();

//        Point point = new Point();
//        point.prepare();
//        ex11();

//    Dragon dragon = new Dragon();
//        dragon.name = "Dr";
//        dragon.age = 100;
//        dragon.color = "bleak";
//        System.out.println("Имя: " + dragon.name);
//        System.out.println("Возраст: " + dragon.age);
//        System.out.println("Цвет: " + dragon.color);
//        System.out.println("Может дышать огнём: " + dragon.isFireBreathing);
//
//    System.out.println("----------------------------------------------");
//    Dragon redDragon = new Dragon("Flame", 150, "red", true);
//        System.out.println("Имя: " + redDragon.name);
//        System.out.println("Возраст: " + redDragon.age);
//        System.out.println("Цвет: " + redDragon.color);
//        System.out.println("Может дышать огнём: " + redDragon.isFireBreathing);
//        redDragon.roar();


    }

    public static void ex11() {
        /**
         * В этой задаче, мы проверим, есть ли у пользователя все необходимые для зелья ингредиенты, и
         * если да, сообщим ему, что он может приступать к приготовлению, иначе, сообщить, что ингредиентов недостаточно.
         * "Драконий коготь, Лист мандрагоры, Корень шершавой астрелии."
         */
        Scanner scanner = new Scanner(System.in);
        String ingredientList = "Драконий коготь, Лист мандрагоры, Корень шершавой астрелии";
        String[] copyIngredientList = ingredientList.split(", ");

        String inputScannerIngredient = scanner.nextLine();
        String[] introducedIngredients = inputScannerIngredient.split(", ");

        int count = 0;
        for (int i = 0; i < copyIngredientList.length; i++) {
            for (int j = 0; j < introducedIngredients.length; j++) {

                if (copyIngredientList[i].equals(introducedIngredients[j])) {
                    count++;
                }
            }
        }
        if (count == copyIngredientList.length){
            System.out.println("У вас есть все необходимые ингредиенты для зелья! Можете начинать создание.");
        } else {
            System.out.println("У вас нехватает ингредиентов.");
        }
    }

    public static void ex10() {
        /**
         * Создайте массив из 5 целых чисел. Напишите код для нахождения наименьшего и наибольшего элемента в массиве.
         * Выведите эти элементы в консоль.
         */
        int[] numbers = {10, 8, 9, 6, 0};
        int min = numbers[0];
        int max = numbers[1];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Min = " + min + "\nMax = " + max);
    }

    public static void ex9() {
        /**
         *  Вам дан рецепт зелья, и пустой массив, который представляет собой котел.
         *  Вам нужно сложить в пустой массив все нужные ингредиенты с помощью обращения к ячейке массива
         *  по индексу и присваивания ей какого-то значения, а затем сравнить два массива с помощью метода
         *  класса Arrays, чтобы проверить, что зелья сварено правильно.
         * Порядок добавления: Капля сока вампирской розы,
         * Слеза феникса, Засушенная чешуя василиска, Частичка души лесной феи,
         * Яд шершавого ядозуба, Осколок кометы
         */
        String[] recipe = {"Засушенная чешуя василиска",
                "Частичка души лесной феи",
                "Капля сока вампирской розы",
                "Яд шершавого ядозуба",
                "Осколок кометы",
                "Слеза феникса"};
        String[] potion = new String[6];
        potion[0] = recipe[2];
        potion[1] = recipe[5];
        potion[2] = recipe[0];
        potion[3] = recipe[1];
        potion[4] = recipe[3];
        potion[5] = recipe[4];
        Arrays.sort(recipe);
        Arrays.sort(potion);
        System.out.println(Arrays.equals(recipe, potion));
    }

    public static void ex8() {
        /**
         * Используя цикл, вычислите сумму всех чётных чисел от 222 до 444 включительно.
         * Результат выведите в консоль. В консоли должно появиться одно число, которое является суммой.
         */
        int sumOfEvenNumbers = 0;
        for (int i = 222; i <= 444; i++) {
            if (i % 2 == 0) {
                sumOfEvenNumbers = sumOfEvenNumbers + i;
            }
        }
        System.out.println(sumOfEvenNumbers);
    }

    public static void ex7() {
        /**
         * Сгенерируйте 2 случайных целых числа.
         * Если оба числа чётные, разделите каждое число на 2 и выведите в консоль сумму.
         * Иначе если только первое число делится на 2, разделите только первое число на 2 и выведите в консоль
         * сумму полученного числа и второго числа.
         * Иначе, если только второе число делится на 2, разделите только второе число на 2 и выведите результат
         * вычисления в консоль.
         * Иначе (если никакое число не делится на 2) просто выведите в консоль сумму этих чисел.
         */
        Random random = new Random();
        double sum;
        double firstNumber = random.nextDouble();
        double secondNumber = random.nextDouble();
        System.out.println(firstNumber + " " + secondNumber);
        if (firstNumber % 2 == 0 && secondNumber % 2 == 0) {
            firstNumber = firstNumber / 2;
            secondNumber = secondNumber / 2;
            sum = firstNumber + secondNumber;
            System.out.println(sum);
        } else if (firstNumber % 2 == 0 && secondNumber % 2 == 1) {
            firstNumber = firstNumber / 2;
            sum = firstNumber + secondNumber;
            System.out.println(sum);
        } else if (firstNumber % 2 == 1 && secondNumber % 2 == 0) {
            secondNumber /= 2;
            System.out.println(secondNumber);
        } else {
            sum = firstNumber + secondNumber;
            System.out.println(sum);
        }
    }

    public static void castSpell() {
        /**
         * Теперь работаем внутри метода castSpell().
         * 1. Создайте строку в верхнем регистре: ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA.
         * 2. Приведите строку к нижнему регистру.
         * 3. Создайте случайное число int start с помощью класса Random. Число должно быть в диапазоне от 0 до 50.
         * 4. Создайте подстроку от строки, содержащей слова заклинаний, которая будет начинаться с индекса, равного start.
         * 5. Создайте объект класса StringBuilder spell, запишите полученную строку выше в этот объект.
         * 6. Разверните строку задом наперед.
         * 7. В полученной строке поменяйте местами символы под 0 и 1 индексами. * (обратитесь к методу replace:
         * сначала получите символы(одна буква или символ пробела) под этими индексами с помощью метода charAt,
         * а затем используйте их для замены). Должно получиться что-то такое:
         * builder.replace(0, 1, String.valueOf(one));
         * builder.replace(1,2, String.valueOf(zero));
         * 8. Полученную строку выведите на экран. Запускаем метод main.
         * Прочитайте заклинание! Попробуйте запустить несколько раз и посмотрите,
         * как меняется ваше заклинание. Подумайте, почему?
         */

        Random random = new Random();
        int numberRandom = random.nextInt(50);
        //System.out.println(numberRandom);
        String str = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA.";
        String str1 = str.toLowerCase();
        System.out.println(str1);
        String str2 = str1.substring(numberRandom);
        //System.out.println(str2);
        StringBuilder spell = new StringBuilder(str2);
        //System.out.println(spell.reverse());
        String strZero = String.valueOf(spell.charAt(0));
        String strOne = String.valueOf(spell.charAt(1));
        spell.replace(0, 1, strOne);
        spell.replace(1, 2, strZero);
        System.out.println(spell);


    }

    public static void ex6() {
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
        String o = del.replaceAll("0", "o");
        String b = o.replaceAll("6", "b");
        System.out.println(b);
        System.out.println(b.contains("23"));
        System.out.println(b.indexOf("ob"));

    }

    public static void ex5() {
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

    public static void ex4() {
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

    public static void ex3() {
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

    public static void ex2() {
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
        if (theFirstThreeDigits == theSecondThreeDigits || sumTheFirstThreeDigits == sumTheSecondThreeDigits) {
            System.out.println("Билет с номером " + ticketNumber + " счастливый.");
        } else {
            System.out.println("Билет с номером " + ticketNumber + " несчастливый.");
        }
    }

    public static void ex1() {
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

