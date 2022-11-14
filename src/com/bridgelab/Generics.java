package com.bridgelab;

import java.util.Scanner;

public class Generics {
    public static <T extends Comparable<T>> void bigger(T...input){
        T max = input[0];
        for (T t : input){
            if (t.compareTo(max) > 0){
                max = t;
            }
        }
        printMax(max);
    }
    public static <T> void printMax(T max){
        System.out.println("Maximum number is :: " + max);
    }
    public static void main(String[] args) {
        bigger(10,20,3,4,26);
        bigger(10.6,20.5,30.5,31.3);
        bigger("Orange","Banana","Apple");
    }
}
