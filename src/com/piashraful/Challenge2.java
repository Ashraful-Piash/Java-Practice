package com.piashraful;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int count = 0;
        int originalNumber = n;
        while(n>0){
            int lastDigit = n % 10;
            n = n / 10;
            if( lastDigit != 0 && originalNumber % lastDigit == 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
