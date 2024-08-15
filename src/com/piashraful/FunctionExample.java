package com.piashraful;

import java.util.Scanner;

public class FunctionExample {
    public static void main(String[] args) {

        String name = printName();
        System.out.println("Name is " + name);


    }

    public static String printName() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = scanner.nextLine();
        scanner.close();
        return userName;
    }
}
