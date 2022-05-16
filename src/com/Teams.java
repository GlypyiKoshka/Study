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

        Table(arr);
        add(arr);
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

    static int add(int[][] arr) {
        Random Random = new Random();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Random.nextInt(10) + 1;
                sum += arr[i][j];
            }
            whowinner(arr, sum);
            count++;
            System.out.println(count + ". " + sum);
        }
        return sum;
    }

    static void whowinner(int[][] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                int lin = arr[0][j];
            }
        }
    }
}

