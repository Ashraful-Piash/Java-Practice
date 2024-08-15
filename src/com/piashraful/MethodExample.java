package com.piashraful;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        findSmallestNumber();
    }

    public static void findSmallestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        int smallest = firstNumber;

        if (secondNumber < smallest) {
            System.out.println("smallest number is " + secondNumber);
        } else if (thirdNumber < smallest) {
            System.out.println("smallest number is " + thirdNumber);
        } else {
            System.out.println("smallest number is " + firstNumber);
        }
    }
}
