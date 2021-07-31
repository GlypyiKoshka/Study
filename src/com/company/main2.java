package com.company;

import java.sql.SQLOutput;

import java.util.Scanner;

public class main2 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Число: ");

        n = scanner.nextInt();

/*         // 1

        for ( int i = a; i >= 0; i -= 2) {
            System.out.println(i);
        }

        // 2

        for ( int i = a; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3

        for (int i = a; i > 1; i -= 2) {
            System.out.print(i + ",");
        }
        System.out.print(a % 2);

        // 4

        System.out.println();
        for (int i = 0; i < 10; i++ ) {
            System.out.println("*");
        }

        // 5

        System.out.println();
        for (int i = 0; i < 10; i++ ) {
            System.out.print("* ");
        }
*/
        // 6

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 7

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 8

        for (int i = n; i >= 1 && i % 2 == 1; i -= 2) {
            System.out.println(i);
        }
        for (int i = 3; i <= n; i += 2) {
            System.out.println(i);
        }

        // 9

        for (int i = 0; i < n; i++) {
            for (int j = n; j >= i; j = j - 2) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 10

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

    }
}
