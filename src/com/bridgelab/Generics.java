package com.bridgelab;

import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        System.out.println("Welcome to the Generics of Maximum Problem");
        String a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value :: ");
        a = sc.next();
        System.out.print("Enter b value :: ");
        b = sc.next();
        System.out.print("Enter c value :: ");
        c = sc.next();

        if (a.length() > b.length() && a.length() > c.length()){
            System.out.println(a+" is bigger");
        } else if (b.length() > c.length()) {
            System.out.println(b+ " is bigger");
        }else {
            System.out.println(c+ " is bigger");
        }
    }
}
