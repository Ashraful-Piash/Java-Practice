package com.piashraful;

public class Main {
    public static void main(String[] args) {
        Human piash = new Human("piash", 20, "027888", "Bangladesh");
        Human piash2 = new Human("piash1", 21, "027888", "Bangladesh");
        System.out.println(piash.name);
        System.out.println(Human.population);
    }
}
