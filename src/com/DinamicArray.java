package com;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class DinamicArray {
    public static void main(String[] args) {

//        Пользователь вводит числа, до тех пор, пока не введет 0.
//        Эти числа запоминаются в динамический массив. 0 в массив попасть не должен.
//        После ввода необходимо перемножить элементы массива и вывести результат перемножения на экран


        ArrayList<Integer> arr = new ArrayList<>();
        Random Random = new Random(12345);
        Scanner scanner = new Scanner(System.in);

 /*       System.out.println("Введите числа в массив ");
        int n = scanner.nextInt();
        int result = 1;

        while (n != 0) {
            arr.add(n);
            n = scanner.nextInt();
        }
        for (Integer i : arr) {
            result *= i;
        }
        System.out.println("Произведение " + result);*/

        //////////////////////////////////////////////////////////////////////

//        динамический массив генерируется случайным образом.
//        найти максимальное значение и его индекс в этом массиве


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
//
    }

    static void printArrayList(ArrayList<Integer> arr) {
        int i;
        for (i = 0; i < arr.size(); i++) {
            System.out.println("[ " + i + " ] " + arr.get(i));
        }
        System.out.println("Индекс [ " + i + " ] " + arr.get(i));
    }
}
  /*  Пользователь вводит количество элементов массива
        Сгенерировать массив случайным образом в диапазоне от -5 до 15.
        Вывести массив на экран. Отсортировать массив методом пузырька.
        Вывести массив на экран. В качестве массива использовать ArrayList*/