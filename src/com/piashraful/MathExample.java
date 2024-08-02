package com.piashraful;

import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value: ");

        double value = scanner.nextDouble();

        double finalValue;
        double fractionalValue = value - Math.floor(value);
        if(fractionalValue <= 0.5 ){
            finalValue = (Math.floor(value));
        } else {
            finalValue = (Math.ceil(value));
        }
        System.out.println("The adjusted value is "+ finalValue);
    }
}
