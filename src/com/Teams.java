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

        Random(arr);
        Table(arr);
        int sum = Sum(arr[0],n);
        System.out.println(sum);
    }

    static int Sum(int[] arr, int n) {
        int[] total = new int [n];
        int sum = 0;
        for (int i = 0; i < total.length; i++) {
            arr[i] += total[i];
        }
        return sum;
    }

    static void Table(int[][] arr) {
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

    static void Random(int[][] arr) {
        Random Random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Random.nextInt(10) + 1;
            }
        }
    }

//    static int[] Sort(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                int y = Sum(arr[i]);
//                int x = Sum(arr[0]);
//                if (y > x) {
//                }
//                tmp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = tmp;
//            }
//        }
//    }

}



