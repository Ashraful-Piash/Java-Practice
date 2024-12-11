package com.piashraful;

public class SpacesIndex {
    public static void main(String[] args) {




        String s = "LeetcodeHelpsALot";
        String[] split = s.split("");
        int count = 0;
        for(int i = 0;i<split.length;i++){
            if(split[i].equals(" ")){
                count++;
            }
            if(count == 1 || count == 2){
                System.out.print(" ");
            }
            System.out.print(split[i]);
        }

    }

}
