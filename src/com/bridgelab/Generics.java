package com.bridgelab;

import java.util.Scanner;

public class Generics {
    public static <T extends Comparable<T>> void bigger(T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0){
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum number is :: " +max);
    }
    public static void main(String[] args) {
        bigger(10,20,3);
        bigger(10.6,20.5,30.5);
        bigger("Orange","Banana","Apple");
    }
}
