package com;
/*
 Пользователь вводит с клавиатуры строку и после нее символ.
 Необходимо найти этот символ в строке и выдать его номер.
 Если таких символов несколько, выдать номер первого из них.
 Если таких символов нет, выдать сообщение, что такого символа в строке нет.
 Для поиска использовать алгоритм линейного поиска
 */

import java.util.Scanner;

public class StringLineSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Наберите строку ");
//        String s = scanner.next();
//
//        char ch = scanner.next().charAt(0);
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (ch == s.charAt(i)) {
//                count++;
//                System.out.println("Индекс = " + i);
//                break;
//            }
//        }
//        if (count == 0) {
//            System.out.println("Символов в строке нет ");
//        }


///////////////////////////////////////////////////////////

/*
 Пользователь вводит строку. Необходимо проверить, является ли эта строка палиндромом.
 При решении задачи исходную строку нельзя изменять, копировать, изменять при копировании и прочие действия,
 связанные с изменением. Проверка должна выполнится не более чем за один проход по строке.
 */

        System.out.println("Проверка на палиндром ");
        String s = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                s.charAt(s.length()- 1 - i);
            } else if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println("не палиндром ");
                found = true;
                break;
            }
        }

        if (!found ) {
            System.out.println("палиндром ");
        }
    }
}








