package com.company;

import java.util.Scanner;
import java.util.Random;


public class factrec {

    public static void main(String[] args) {

        System.out.println("Введи номер Fact: ");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (fact(n) == recfact(n)) {
            System.out.println(" Факториал " + n + " : " + fact(n) + " = " + recfact(n));
        } else System.out.println(" Факториалы не равны ");
    }

    static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int recfact(int n) {
        int fact = 1;
        if (n == 0) return fact;
        fact = n * recfact(n - 1);
        return fact;
    }

}
