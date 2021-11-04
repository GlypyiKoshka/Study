package com;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        System.out.print("Введите элементы массива: ");

        int[] arr = new int[n];

        addArray(arr);
        printArray(arr);
        int sum = sumArray(arr);
        System.out.println("Сумма элементов массива = " + sum);
    }

    static void addArray(int[] arr) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
    }

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] => " + arr[i]);
        }
    }

}
