package com.piashraful;

public class WrapperDemoOne {
    public static void main(String[] args) {
        //int = Integer
        //char = Character
        //double = Double
        int num = 5;
        Integer num1 = num;
        int num2 = num1.intValue();
        System.out.println(num2);

        String num3 = "5";
        int num4 = Integer.parseInt(num3);
        System.out.println(num4 *2);
    }
}
