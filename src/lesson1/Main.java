package lesson1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Задание 2
        byte Byte1;
        Byte1 = 123;

        short Short1;
        Short1 = 12345;

        int Int1;
        Int1 = 1234567890;

        long Long1;
        Long1 = 1234567890;

        float Float1;
        Float1 = 123.45f;

        double Double1;
        Double1 = 123.456;

        boolean Boolean1;
        Boolean1 = true;

        char symbol = 'f';

                        System.out.println("Задание 3");

        int a = 5;
        int b = 10;
        int c = 20;
        int d = 10;

        int f = (int) (a * (b + (c / d)));

        System.out.println(f);

                        System.out.println("Задание 4");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int q = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите второе число:");
        int w = sc.nextInt();

        int e = (int) (q + w);

        if (e >= 10 & e <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

                       System.out.println("Задание 5");

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите число:");
        int r = sc.nextInt();

        if (r >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

                        System.out.println("Задание 6");

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите число:");
        int t = sc.nextInt();

        if (r >= 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
                         System.out.println("Задание 7");

        String name = "Daniil";
        System.out.println("Привет," +"" + name + "!");



    }
}
