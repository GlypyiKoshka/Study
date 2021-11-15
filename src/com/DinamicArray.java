package com;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class DinamicArray {
    public static void main(String[] args) {
/*
        Пользователь вводит числа, до тех пор, пока не введет 0.
        Эти числа запоминаются в динамический массив. 0 в массив попасть не должен.
                После ввода необходимо перемножить элементы массива и вывести результат перемножения на экран


        ArrayList<Integer> arr = new ArrayList<>();
        Random Random = new Random(12345);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа в массив ");
        int n = scanner.nextInt();
        int result = 1;

        while (n != 0) {
            arr.add(n);
            n = scanner.nextInt();
        }
        for (Integer i : arr) {
            result *= i;
        }
        System.out.println("Произведение " + result);

        //////////////////////////////////////////////////////////////////

        динамический массив генерируется случайным образом.
        найти максимальное значение и его индекс в этом массиве


        for (int i = 0; i < 10; i++) {
            int r = Random.nextInt(100);
            arr.add(r);
        }
        int num = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(num) < arr.get(i)) {
                num = i;
            }
        }
        printArrayList(arr);
        System.out.println("Индекс [ " + num + " ] " + arr.get(num));

    }

    static void printArrayList(ArrayList<Integer> arr) {
        int i;
        for (i = 0; i < arr.size(); i++) {
            System.out.println("[ " + i + " ] " + arr.get(i));
        }
    }
}

                */

//        В качестве массива использовать ArrayList
//        Пользователь вводит количество элементов массива
//        Сгенерировать массив случайным образом в диапазоне от -5 до 15.
//        Вывести массив на экран. Отсортировать массив методом пузырька.
//        Вывести массив на экран.

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int n = Scanner.nextInt();

        ArrayList<Integer> arr = randomArray(n, -5, 15);
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);

    }

    static void printArray(ArrayList<Integer> arr) {
        int i = 0;
        for (; i < arr.size(); i++) {
            System.out.println("[ " + i + " ] " + arr.get(i));
        }
        System.out.println();
    }

    static ArrayList<Integer> randomArray(int size, int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            result.add(r.nextInt(max - min + 1) + min);
        }
        return result;
    }

    static void bubbleSort(ArrayList<Integer> arr) {
        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < arr.size() - 1; i++) {
                if (arr.get(i) > arr.get(i + 1)) {
                    int n = arr.get(i);
                    arr.set((i), arr.get(i + 1));
                    arr.set((i + 1), n);
                    sort = false;
                }
            }
        }
    }

}