package com.company;

import java.util.Scanner;

public class bla {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Реверс: ");

        int n;

        n = scanner.nextInt();

        num(n);
        System.out.println(" ");
        numup(n);
    }

    static void num(int n) {
        if (n == 0)
            return;
        System.out.print(n % 10);
        num(n / 10);
    }

    static void numup(int n) {
        if (n == 0)
            return;
        numup(n / 10);
        n = n % 10 + 1;
        if (n == 10) {
            System.out.print(n * 0);
        } else System.out.print(n);

    }
}


