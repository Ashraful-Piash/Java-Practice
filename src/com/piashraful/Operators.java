package com.piashraful;

public class Operators {
    public static void main(String[] args) {
        int x = 1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

        int a = 5;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int n = 10;
        int m = n++;
        System.out.println(m + n);
    }
}
