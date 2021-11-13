package com;

import java.util.Random;

public class Sort {
    public static void main(String[] args) {

        int[] arr = new int[5];
        // {1, 3, 2, 0, 6, 8};

        addArray(arr);
        System.out.print("До сортировки:                 ");
        printArray(arr);
        System.out.println();
        BubbleSort(arr);
        System.out.print("Пузырьковая сортировка:        ");
        printArray(arr);
        System.out.println();
        InsertionSort(arr);
        System.out.print("Сортировка простыми вставками: ");
        printArray(arr);
        System.out.println();
        SelectionSort(arr);
        System.out.print("Сортировка простым выбором:    ");
        printArray(arr);

    }

    static void addArray(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20 - (-20) + 1) - 20;
        }
    }

    /////////////// Пузырьковая  ////////////////////

    static void BubbleSort(int[] arr) {
        boolean sorted = false;
//        int count = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int n = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = n;
                    sorted = false;
                }
            }
//            count++;
        }
//        return count;
    }

    /////////////// Простые вставки ////////////////////

    static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int cou = i;
            while (i > 0 && arr[i - 1] > arr[i]) {
                int n = arr[cou];
                arr[cou] = arr[i - 1];
                arr[i - 1] = n;
                cou--;
            }
        }
    }

    /////////////// Простым выбором ////////////////////

    static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int n = arr[i];
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


