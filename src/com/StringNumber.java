//package com;
//
//import java.util.Random;
//
//public class StringNumber {
//    public static void main(String[] args) {
//        int[] arr = new int[1];
//        int n=0;
//        int count = 0;
//
//        addArray(arr);
//        numlength(n);
//
//        String[] ones = new String[]{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        String[] tens = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
//        String[] teens = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
//        String hundred = "hundred";
//        String[] orders = new String[]{"", "thousand", "million", "billion"};
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i < 10) {
//                System.out.println(ones[i]);
//            }
//        }
//        if (numlength(n) == 3) {
////            System.out.println(numlength(arr));
//        }
//
//
//    }
//
////    static int numlength(int arr) {
////        int count = 0;
////        int n;
////        while (addArray(n) > 0) {
////            n = n / 10;
//////            count ++;
////        }
////        return n;
////    }
//
//
//    static void addArray(int[] arr) {
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt(500 - (-500) + 1) - 500;
//        }
//    }
//
//    static int ones(int[] arr) {
//        int ones = 0;
//        for (int i = 0; i < 10; i++) {
//            ones++;
//        }
//        return ones;
//    }
//
//    static int tens(int[] arr) {
//        int tens = 0;
//        for (int i = 10; i < 100; i++) {
//            tens++;
//        }
//        return tens;
//    }
//
//    static int teens(int[] arr) {
//        int teens = 0;
//        for (int i = 10; i < 20; i++) {
//            teens++;
//        }
//        return teens;
//    }
//
//    static int hundred(int[] arr) {
//        int hundred = 0;
//        for (int i = 0; i < 101; i++) {
//            hundred++;
//        }
//        return hundred;
//    }
//
//    static int orders(int[] arr) {
//        int orders = 0;
//        for (int i = 0; i < 101; i++) {
//            orders++;
//        }
//        return orders;
//    }
//
//
//}
//
