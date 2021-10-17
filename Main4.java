package com;

import java.util.Scanner;

public class Main4 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int n;

        n = scanner.nextInt();

        int f1 = 1;
        int f2 = 1;
        int f3;
        for (int i = 1; i < n; i++) {
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
        }
        System.out.println(f1);

    }
}