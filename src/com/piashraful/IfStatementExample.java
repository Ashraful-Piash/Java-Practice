package com.piashraful;

import java.util.Scanner;

public class IfStatementExample {
    public static void main(String[] args) {
        System.out.println("What is the temperature? ");
        Scanner scanner = new Scanner(System.in);
        float temperature = scanner.nextFloat();

        if (temperature > 30) {
            System.out.println("It's a hot day. Do not go out.\n Drink plenty of water");
        } else if (temperature > 20 && temperature <= 30) {
            System.out.println("It's a nice day");
        } else {
            System.out.println("It's cold");
        }
        for (int  i = 0; i <10 ; i ++){
            if(i ==6){
                continue;
            }
            System.out.println(i);
        }
    }
}
