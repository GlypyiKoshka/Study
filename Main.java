package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c, d;

        System.out.println("Введите a: ");
        a = scanner.nextDouble();

        System.out.println("Введите b: ");
        b = scanner.nextDouble();

        System.out.println("Введите c: ");
        c = scanner.nextDouble();

        d = c / 2;
        double r1 = (a + b) / (2 * c);

        double r2 = Math.pow((a - b), d);

        System.out.print(r1 + " и " + r2);
        // System.out.println(r2);
    }
}
