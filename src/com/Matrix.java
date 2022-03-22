package com;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи кол-во строк 1 м: ");
        int n1 = scanner.nextInt();
        System.out.print("Введи кол-во столбцов 1 м: ");
        int m1 = scanner.nextInt();
        System.out.print("Введи кол-во строк 2м: ");
        int n2 = scanner.nextInt();
        System.out.print("Введи кол-во столбцов 2м: ");
        int m2 = scanner.nextInt();

        if (n1 == m2) {
            System.out.println(" Матрица 1 ");
            int[][] a = addmassive(n1, m1);
            print(a);
            System.out.println(" Матрица 2 ");
            int[][] b = addmassive(n2, m2);
            print(b);
            System.out.println(" Результирующая ");
            int[][] res = multiply(a, b);
            print(res);
        } else System.out.println("Матрица не вычисляется ");
    }

    static void print(int[][] res) {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print("[ " + res[i][j] + " ]" + " ");
            }
            System.out.println();
        }
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }

    static int[][] addmassive(int n, int m) {
        Random random = new Random();
        int[][] mas = new int[n][m];
        for (int i = 0; i < mas.length; i++) { // arr1.length -- количество строк
            for (int j = 0; j < mas[i].length; j++) {  // arr1[i].length -- количество столбцов
                mas[i][j] = random.nextInt(5 + 5 + 1) - 5;
            }
        }
        return mas;
    }


}