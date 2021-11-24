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
/*

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
*/
/*
    Сгенерировать случайным образом массив, отсортировать его любым известным алгоритмом,
    вывести массив на экран. Пользователь вводит число, которое он хочет найти.
    Найти это число в массиве поиском половинным делением и выдать его номер.
    Если таких элементов несколько, выдать номер любого из них.
    Если такого элемента в массиве нет, выдать соответствующее сообщение
                */

/*
        ArrayList<Integer> arr = randomArray(8, 1, 50);
        bubbleSort(arr);
        printArray(arr);
        search(arr);

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
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, n);
                    sort = false;
                }
            }
        }
    }

    static void search(ArrayList<Integer> arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число которое ищем ");
        int n = scanner.nextInt();
        int start = 0;
        int end = arr.size() - 1;
        boolean ok = false;
        while (!ok) {
            ok = true;
            int center = start + (end - start) / 2;
            if (n == arr.get(center)) {
                System.out.println("Наше число [ " + center + " ] " + arr.get(center));
            } else if (start >= end) {
                System.out.println("Такого числа в массиве нет ");
            } else if (n < arr.get(center)) {
                end = center - 1;
                ok = false;
            } else if (n > arr.get(center)) {
                start = center + 1;
                ok = false;
            }
        }

    }
}*/
/*

    Пользователь вводит целое положительное число n больше 1. Необходимо найти все простые числа больше 1 и меньше n.
    Эти числа необходимо записать в массив, после чего этот массив вывести на экран.
    Число считается простым, если оно делится только на 1 и самого и себя и не делится больше ни на что другое на цело.
    На всякий случай: https://ru.wikipedia.org/wiki/Простое_число
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n ");
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        isPrime(n);

        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            } else arr.add(i);
            System.out.println(arr.get(i));
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}