package com;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StringNumber {

    static String[] ones = new String[]{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String[] tens = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    static String[] teens = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String hundred = "hundred";
    static String[] orders = new String[]{"", "thousand", "million", "billion"};

    public static void main(String[] args) {

        System.out.println("Число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> num = new ArrayList<>();
        addArrayList(num, n);
        
        if (n > 0) {
            for (int i = 0; i < num.size(); i++) {
                if (i == 9) {
                    System.out.println(getOnes(num) + getOrders(num) +;);
                }
                
            }
        }

    }

    static void addArrayList(ArrayList<Integer> num, int n) {
        while (n > 0) {
            int result = n % 10;
            n = n / 10;
            num.add(result);
        }
    }

    static void getOnes(ArrayList<Integer> edinici) {
        int result = 0;
        for (int i = 0; i >= 0 && i < 10; i++) {
            result += i;
        }
        System.out.println(ones[edinici.get(result)]);
    }

    static void getTens(ArrayList<Integer> desytie) {
        int result = 0;
        for (int i = 0; i >= 20 && i < 100; i++) {
            result += i;
        }
        System.out.println(tens[desytie.get(result)]);
    }

    static void getTeens(ArrayList<Integer> desytki) {
        int result = 0;
        for (int i = 0; i >= 10 && i < 20; i++) {
            result += i;
        }
        System.out.println(teens[desytki.get(result)]);
    }

//    static void getHundred(ArrayList<Integer> sotni) {
//        int result = 0;
//        for (int i = 0; i >= 100 ; i++) {
//            result += i;
//        }
//        System.out.println(hundred[sotni.get(result)]);
//    }

    static void getOrders(ArrayList<Integer> ordery) {
        int result = 0;
        for (int i = 0; i >= 1000 ; i++) {
            result += i;
        }
        System.out.println(orders[ordery.get(result)]);
    }

}

