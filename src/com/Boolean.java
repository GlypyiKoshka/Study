package com;

import java.util.Random;
import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {

/*
Известны оценки ученика за год. Определить, является ли он отличником, неуспевающим или обычным.
Отличник -- это такой ученик, у которого все оценки равны 5. Неуспевающий -- это такой ученик,
у которого есть хотя бы одна оценки < 3. Обычный ученик -- это ученик, не являющийся отличником
и неуспевающим Решить эту задачу с использованием только одного цикла

        Scanner scanner = new Scanner(System.in);
        System.out.println("Статус ученика: ");

        int[] arr = new int[5];
        boolean five = true;
        boolean two = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] != 5) {
                five = false;
            }
            if (arr[i] == 2) {
                two = true;
            }
        }
        if (five) {
            System.out.println(" Отличник ");
        } else if (two) {
            System.out.println("Неуспевающий ");
        } else System.out.println("Обычный ");
    }
}
/*
    Пользователь вводит размер массива, после чего массив
    генерируется случайным образом. После этого массив
        выводится на экран. Необходимо найти самый большой по величине
        элемент массива (максимум) и его номер
*/
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        int index = 0;
        int min = -10;
        int max = 10;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
            System.out.println("arr[" + i + "] => " + arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[index] < arr[i]) {
                index = i;
            }
        }
        System.out.print("Максимальное число: ");
        System.out.println("[ " + index + " ] => " + arr[index]);
    }
}