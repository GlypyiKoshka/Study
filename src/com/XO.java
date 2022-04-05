package com;

import java.util.Scanner;

/*
    Два игрока играют в крестики и нолики, Первым ходит крестик.
    Программа отображает поле после каждого хода, после чего запрашивает ход следующего игрока,
    Игра продолжается до тех пор, пока кто-то не выиграл, либо пока не наступила ничья.
    Ничьей будем считать ситуацию, когда все поле заполнено, но никто не выиграл
*/

public class XO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] field = new String[3][3];

        empty(field);
        printfield(field);

        int count = 0;
        boolean go = true;
        while (go) {
            System.out.println("Введите координаты: ");

            countpalyers(count);

            int f = scanner.nextInt();
            int s = scanner.nextInt();

            while (f < 1 || f > 3 || s < 1 || s > 3 || !field[f - 1][s - 1].equals(" ")) {
                System.out.println("Неверные координаты, повторите ввод: ");
                f = scanner.nextInt();
                s = scanner.nextInt();
            }

            if (field[f - 1][s - 1].equals(" ") && count % 2 == 0) {
                field[f - 1][s - 1] = "X";
                count++;
            } else if (field[f - 1][s - 1].equals(" ") && count % 2 != 0) {
                field[f - 1][s - 1] = "0";
                count++;
            } else if (count == 9) {
                System.out.println("Eng game ");
                go = false;
            }

            printfield(field);
            whowinner(field, go);

        }
    }

    static boolean whowinner(String[][] field, boolean go) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2]) && !field[i][0].equals(" ")) {
                System.out.println("win " + field[i][0]);
                go = false;
                break;
            } else if (field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i]) && !field[0][i].equals(" ")) {
                System.out.println("win " + field[0][i]);
                go = false;
                break;
            } else diagonal(field, go);
        }
        return go;
    }

    static boolean diagonal(String[][] field, boolean go) {
        if (field[0][0].equals("X") && field[1][1].equals("X") && field[2][2].equals("X")) { // \ диагональ
            System.out.println("X win");
            go = false;
        } else if (field[2][0].equals("X") && field[1][1].equals("X") && field[0][2].equals("X")) { // / диагональ
            System.out.println("X win");
            go = false;
        } else if (field[0][0].equals("0") && field[1][1].equals("0") && field[2][2].equals("0")) { // \ диагональ
            System.out.println("0 win");
            go = false;
        } else if (field[2][0].equals("0") && field[1][1].equals("0") && field[0][2].equals("0")) { // / диагональ
            System.out.println("0 win");
            go = false;
        }
        return go;
    }


    static void countpalyers(int count) {
        if (count % 2 == 0) {
            System.out.println("X go");
        } else System.out.println("0 go");
    }

    static void empty(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = " ";
            }
        }
    }

    static void printfield(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.println();
            System.out.println("+-+-+-+");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print("|" + field[i][j]);
            }
            System.out.print("|");
        }
        System.out.println();
        System.out.println("+-+-+-+");
    }
}
