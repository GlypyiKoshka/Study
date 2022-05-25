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


        createRandomInArray(arr);
        printTable(arr);
        int[] sumarray = addSumInArray(arr);
        addSumInArray(arr);
        printSumArray(sumarray);
        sortTeams(sumarray);
    }

    static void printSumArray(int[] sumarray) {
        for (int i = 0; i < sumarray.length; i++) {
            System.out.println(sumarray[i]);
        }
    }

    static int[] sortTeams(int[] sumarray) {
        int[] teamNumbers = new int[sumarray.length];
        for (int i = 0; i < teamNumbers.length; i++) {
            teamNumbers[i] = i;
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int j = 0; j < sumarray.length - 1; j++) {
                    if (sumarray[j] > sumarray[j + 1]) {
                        int n = sumarray[j];
                        sumarray[j] = sumarray[j + 1];
                        sumarray[j + 1] = n;
                        sorted = false;
                    }
                }
            }
            System.out.println("Команда " + i + "набрала " + sumarray[i] + " очков и занимает " + i + " место");
        }
        // получает массив сумм, возвращает массив номеров команд, упорядоченных по убыванию суммы очков
        // сортировать массив sumarray по убыванию
        // когда при сортировке массива sumarray нужно поменять местами i и j элементы
        // меняем также местами i и j элементы в массиве номеров команд
        return teamNumbers;
    }

    static int[] addSumInArray(int[][] arr) {
        int[] k = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            k[i] = sum(arr[i]);
        }
        return k;
    }

    static void printTable(int[][] arr) {
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

    static void createRandomInArray(int[][] arr) {
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

    /*static int[] sortTeams(int[] sumarray) {
        int[] teamNumbers = new int[sumarray.length];
        for (int i = 0; i < teamNumbers.length; i++) {
            teamNumbers[i] = i;
            for (int j = 0; j < i; j++) {
                sumarray[i] = i;
            }
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int k = 0; k < teamNumbers.length - 1; k++) {
                    if (teamNumbers[k] > teamNumbers[k + 1]) {
                        int n = teamNumbers[k];
                        teamNumbers[k] = teamNumbers[k + 1];
                        teamNumbers[k + 1] = n;
                        sorted = false;
                    }
                }
            }
        }
        // получает массив сумм, возвращает массив номеров команд, упорядоченных по убыванию суммы очков
        // сортировать массив sumarray по убыванию
        // когда при сортировке массива sumarray нужно поменять местами i и j элементы
        // меняем также местами i и j элементы в массиве номеров команд
        return teamNumbers;
    }*/

        /*static int[] sorting(int[] arr) {
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
    }*/
}




