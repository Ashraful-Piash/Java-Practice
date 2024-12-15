package com.piashraful;

public class Human {
        
        String name;;
        int age;
        String phone;
        String address;
        static long population;

        public Human(String name, int age, String phone, String country) {
            this.name = name;
            this.age = age;
            this.phone = phone;
            this.address = country;
            this.population +=1;
        }
    }

