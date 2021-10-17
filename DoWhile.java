package com;

import java.util.Scanner;
import java.util.Random;

public class DoWhile {
    public static void main(String args[]) {

/*        System.out.println("Пользователь, введи нечетное число: ");

        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();
        // 1 задача


        while (n % 2 == 0) {
            System.out.println("Ошибка, введи еще раз: ");
            n = scanner.nextInt();
        }
        for (int i = n; i > 0; i -= 2) {
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 3; i <= n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2 задача

        Scanner scanner = new Scanner(System.in);

        System.out.println("Пользователь, введи число: ");

        int n;
        n = scanner.nextInt();

        int prod = 1;

        while (n != 0) {
            prod *= n;
            n = scanner.nextInt();
        }
        System.out.println("Произведение равно: " + prod);


        // 3 задача

        Scanner scanner = new Scanner(System.in);

        System.out.println("Пользователь, введи число: ");

        int i, n;
        int sum = 0;
        n = scanner.nextInt();

        while (n > 0) {
            i = n%10;
            n = n / 10;
            sum = sum + i;
        }
        System.out.println(sum);



        // 4 задача

        Random random = new Random();

        int min = 80;
        int max = 120;

        int x = random.nextInt(max - min + 1) + min;

        System.out.println("Угадай ");


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        do {
            if (n > x) {
                System.out.println("Мое число меньше ");
                count++;
                n = scanner.nextInt();
            } else if (n < x) {
                System.out.println("Мое число больше ");
                count++;
                n = scanner.nextInt();
            } else {
                System.out.println("Угадали");
                count++;
                System.out.println("Попытки: " + count);
                break;
            }
        }
        while (n != x);

*/          /////

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int finalresult = fact(n) / (fact(m) * fact(n - m));
        System.out.println(finalresult);
    }

    static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    //////////

    {
        System.out.println("Введи номер числа Фи: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Фи = " + fib(n));
    }

    static int fib(int n) {
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        for (int i = 1; i < n; i++) {
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }


}

