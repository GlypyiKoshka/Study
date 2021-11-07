package com;

import java.util.Random;

public class SortArraytwo {
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


    }

    static void addArray(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20 - (-20) + 1) - 20;
        }
    }

    static void sortArray(int[] arr) {
        int min = 0;
        int n;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            n = arr[i];
            arr[i] = arr[min];
            arr[min] = n;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr [");
            System.out.print(arr[i] + " ");
            System.out.print("] ");
        }
    }
}

