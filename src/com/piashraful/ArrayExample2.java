package com.piashraful;

import java.util.Arrays;
import java.util.List;

public class ArrayExample2 {
    public static void main(String[] args) {
        String [] arrs = {"chicken","beef","mutton"};
        List<String> items= Arrays.asList(arrs);

        for(String s :items){
            System.out.println(s);
        }
    }
}
