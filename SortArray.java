package com;

import java.util.Random;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {

        int[] arr = new int[5];

        addArray(arr);
        System.out.print("До сортировки: ");
        printArray(arr);
        System.out.println();
        sortArray(arr);
        System.out.print("После сортировки: ");
        printArray(arr);
        System.out.println();
        System.out.print("Колличество проходов: " + sortArray(arr));

    }

    static void addArray(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20 - (-20) + 1) - 20;
        }
    }

    static int sortArray(int[] arr) {
        boolean sorted = false;
        int count = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int n = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = n;
                    sorted = false;
                }
                count++;
            }
        }
        return count;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr [");
            System.out.print(arr[i] + " ");
            System.out.print("] ");
        }
    }
}
