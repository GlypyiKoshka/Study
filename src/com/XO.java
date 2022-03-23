package com;
import java.util.Random;
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
        Random random = new Random();

        String[][] field = new String[3][3];

        System.out.println("+-+-+-+");
        System.out.println("|"+field[0][0]+"|"+field[0][1]+"|"+field[0][2]+"|");

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length ; j++) {
                field[i][j]=" ";
                System.out.println(field[i][j]);
            }
            System.out.println();
        }

    }
}
