package com.piashraful;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Piash,Ashraful,Haque,bkash";

        String names[] = s1.split(",");


        for(String name: names){
            System.out.println(name);
        }

    }
}