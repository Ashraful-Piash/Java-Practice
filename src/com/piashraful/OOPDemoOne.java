package com.piashraful;

public class OOPDemoOne {
    public static void main(String[] args) {


//        Car car1 = new Car();
//        car1.color = "red";
//        car1.design = "SUV";
//        car1.name = "Honda";
//        System.out.println(car1);
//        System.out.println(car1.color);
//        Car car2 = new Car("green", "Sedan", "Toyota");
        Car car2 =  new Car();
        System.out.println(car2);
        car2.display();

    }
}

class Car {
    String name;
    String color;
    String design;

//    public Car(String name, String color, String design) {
//        this.name = name;
//        this.color = color;
//        this.design = design;
//    }

   public Car(){
        this.name = "Honda";
        this.color = "red";
        this.design = "suv";
    }

    void display(){
        System.out.println("display method");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", design='" + design + '\'' +
                '}';
    }
}

