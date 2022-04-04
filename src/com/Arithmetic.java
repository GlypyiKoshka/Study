package com;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, p;
        System.out.println("Пользователь введи x: ");
        x = scanner.nextDouble();
        System.out.println("Пользователь введи y: ");
        y = scanner.nextDouble();

        p = (Math.log10(x) - Math.exp(x + y)) / (Math.sqrt(2) + y * y + Math.abs((Math.pow(x, 3)) - Math.log(y)));
        System.out.println("Ответ: p = " + p);
    }
}
