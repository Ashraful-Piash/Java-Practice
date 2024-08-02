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

        Integer [] numbers = {1,2,3,4,5,5};
        List<Integer> num = Arrays.asList(numbers);

        for(Integer i : num){
            System.out.println(i);
        }
    }
}
