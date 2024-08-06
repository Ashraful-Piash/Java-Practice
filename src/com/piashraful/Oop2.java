package com.piashraful;

public class Oop2 {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.age = 20;
        person1.name = "piash";
        person1.isEligibleForVoting(person1.age);

        Person person2 = new Person();
        person2.name = "Peal";
        person2.walk();
        person2.eat();
        person2.age = 17;
        person2.isEligibleForVoting(person2.age);


    }
}

class Person {
    String name;
    int age;

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void isEligibleForVoting(int age) {
        if (age > 18)
            System.out.println(name + " is eligible for voting");
        else
            System.out.println(name + " is not eligible for voting");
    }
}
