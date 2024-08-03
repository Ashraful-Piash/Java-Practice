package com.piashraful;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[] cars = {"Audi", "Beng", "Mustang"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        int[] numbers = {1, 2, 3, 4, 5,};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int [] marks = new int[5];
        marks[0] = 1;
        System.out.println(Arrays.toString(cars));

    }
}
