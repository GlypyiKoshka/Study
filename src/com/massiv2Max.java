package com;

import java.util.Random;
import java.util.Scanner;

public class massiv2Max {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи кол-во строк: ");
        int n = scanner.nextInt();
        System.out.print("Введи кол-во столбцов: ");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m]; // прямоугольный двумерный массив
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { // arr1.length -- количество строк
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {  // arr1[i].length -- количество столбцов
                arr[i][j] = random.nextInt(5 + 5 + 1) - 5;
                sum += arr[i][j];

                System.out.print("[ " + arr[i][j] + " ]" + " ");
//                int[]t = arr[i];
//                int[]f = arr[j];
//                System.out.println(arr[i]);
//                System.out.println(arr[j]);

            }

            System.out.println(" = " + sum);
        }
        System.out.println(" Макс = " + max);
    }
}

