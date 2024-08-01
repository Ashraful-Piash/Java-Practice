package com.piashraful;

import java.awt.*;

public class Hello {
    public static void main(String[] vars) {
        
        int age = 30;
        int myAge = 29;
        int herAge = myAge;

        String x = "helo";
        String z = x;

        System.out.println(x);
        System.out.println(z);
        System.out.println(age);
        System.out.println(herAge);

        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x=5;
        point1.y= 6;
        System.out.println(point1);
        System.out.println(point2);

        String str1 = new String("Hello");
        String str2 = str1;
        str2.isEmpty();
        System.out.println(str1);
        System.out.println(str2.isEmpty());


    }
}
