package com.piashraful;

import java.util.Scanner;

public class StringOp {
    public static void main(String[] args) {
        String s1,s2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 string");

        s1 = scanner.nextLine();
        s2 = scanner.nextLine();

        int l1 = s1.length();
        int l2 = s2.length();

        System.out.println("Length of first string: " + l1);
        System.out.println("Length of second string: " + l2);
        String s3 = s1.concat(" " +s2);

        System.out.println("String after concatenation: " + s3);

        s1 = s1.toUpperCase();
        s2 = s2.toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
    }
}
