package com;

import java.util.Scanner;
import java.util.Random;


public class Rec {

    public static void main(String[] args) {

        System.out.println("Введи номер числа Фи: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (fib(n) == recfib(n)) {
            System.out.println(" Фибоначчи " + n + " : " + fib(n) + " = " + recfib(n));
        } else System.out.println(" Числа Фи не равны ");

    }

    static int fib(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i <= n; i++) {
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    static int recfib(int n) {
        if (n == 1 || n == 2)
            return 1;
        return recfib(n - 1) + recfib(n - 2);
    }
}
