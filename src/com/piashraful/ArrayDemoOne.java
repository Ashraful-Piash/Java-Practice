package com.piashraful;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemoOne {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[5];
        int [] numbers2 = {2,3,4,4,4};

//        for(int i = 0; i< numbers.length;i++){
//            numbers[i] = scanner.nextInt();
//        }
//        for(int num : numbers2){
//            System.out.print(num + " ");
//        }

        String [] array = new String [4];

        for(int i = 0; i< array.length; i++){
            array[i] = scanner.next();
        }
        System.out.print(Arrays.toString(array)
        );

    }

}
