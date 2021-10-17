package com.company;

import java.util.Scanner;
import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int found = 0;

        addArray(arr);
        PrintArray(arr);

        System.out.println("Находим число массива и узнаем его номер ");
        int m = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (m == arr[i]) {
                found++;
                System.out.println(i);
                break;
            }
        }
        if (found == 0) {
            System.out.println("Числел нет");
        }
    }

    static void addArray(int[] arr) {
        Random r = new Random();
        int min = -10;
        int max = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(max - min + 1) + min;
        }
    }

    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] => " + arr[i]);
        }
    }
}

/*
Пользователь вводит целое положительное число n -- размер массива. Заполнить массив данного размера n случайными числами
в диапазоне от -10 до 10 (включительно). Вывести массив на экран. После этого пользователь вводит целое число.
Необходимо найти это число в массиве и вывести его номер. Если такого элемента в массиве нет -- вывести сообщение,
что такого элемента в массиве нет. Если таких чисел в массиве несколько, вывести номер первого из них
Например, массив: 2, 7, 3, 4, 7, 1
Найти: 7
Нужно вывести: 1
При решении этой задачи воспользоваться функцией печати массива на экран из предыдущей задачи.
Написать функцию создания массива заданного размера случайным образом
 */