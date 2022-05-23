package com;

import java.util.Random;
import java.util.Scanner;

/*
        N команд играют M соревнований. За каждое соревнование они получают от 1 до 10 очков.
        Необходимо присвоить места командам: первое место: команда, набравшая наибольшее количество очков.
        Пользователь вводит значения N и M, каждое больше 1. Программа генерирует таблицу соревнований случайным образом,
        после чего выводит на экран. Затем нужно вывести занятые командами места в формате номер места - номер команды
        */

public class Teams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        createrandominarray(arr);
        printtable(arr);
        printsum(arr);
        int[] sumarray = new int[arr.length];
        sumarray = addsuminarray(arr);
        printsorting(sumarray());

    }

    static int[] sorting(int[] arr) {
        boolean sorted = false;
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
        }
        return arr;
    }

    static void printsorting(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
             int [] k = sorting(arr[i]);
            System.out.print(k[i] + " ");
        }
    }

    static int[] addsuminarray(int[][] arr) {
//        int[] k = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            k[i] = sum(arr[i]);
        }
        return k;
    }

    static void printsum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int k = sum(arr[i]);
            System.out.print(k + " ");
        }
    }

    static void printtable(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.println("+-+-+-+");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("|" + arr[i][j]);
            }
            System.out.print("|");
        }
        System.out.println();
        System.out.println("+-+-+-+");
    }

    static void createrandominarray(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10) + 1;
            }
        }
    }

    static int sum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}




