package com.piashraful;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();

        System.out.print("The digits of the number are: ");

        while(n> 0){
           int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n/ 10;
        }

    }

}
