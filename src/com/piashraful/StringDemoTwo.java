package com.piashraful;

public class StringDemoTwo {
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println(str.equals("Java Programming"));
        System.out.println(str.equalsIgnoreCase("JAVA PROGRAMMING"));
        System.out.println(str.startsWith("Java"));
        System.out.println(str.endsWith("ming"));
        System.out.println(str.contains("Pro"));
        System.out.println(str.indexOf('m'));
        System.out.println(str.indexOf("mming"));
        System.out.println(str.indexOf("ph"));



    }
}
