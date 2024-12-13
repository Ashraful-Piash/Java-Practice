package com.piashraful;

public class StringDemoOne {
    public static void main(String[] args) {

        String s1 = "Piash";
        String s2 = new String("Piash");
        String s4 = new String("Piash");
        System.out.println(s2==s4);
        System.out.println(s2.equals(s4));
        System.out.println(s1 == s1);
        s1 = "Haque";
        System.out.println(s1.equals(s2));
        System.out.println(s1);
        String a = "Ashraful";
        String b = "Ashraful";
        System.out.println(a==b);

        StringBuilder stringBuilder= new StringBuilder("Hello");
        stringBuilder.append(" World");
        System.out.println(stringBuilder.toString());

        String json = """
                {
                    "name": "John Doe",
                    "age": 30,
                    "city": "New York"
                }
                """;

        System.out.println(json);



    }
}
