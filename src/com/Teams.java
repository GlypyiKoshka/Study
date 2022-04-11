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
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int table [][] = new int[n][m];
        Table(table);
        add(table);
    }

    static void Table(int [][] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println();
            System.out.println("+-+-+-+");
            for (int j = 0; j < table[i].length; j++) {
                System.out.print("|" + table[i][j]);
            }
            System.out.print("|");
        }
        System.out.println();
        System.out.println("+-+-+-+");
    }

    static void add(int[][] table) {
        Random Random = new Random();
        int min = 0;
        int max = 10;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < i; j++) {
                table[j][i] = Random.nextInt(max - min + 1) + min;
            }
        }
    }
}
