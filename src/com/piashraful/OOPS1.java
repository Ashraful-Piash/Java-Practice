package com.piashraful;

public class OOPS1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "Ball pen";
        System.out.println(pen1);
        pen1.write();

    }
}

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    @Override
    public String toString() {
        return "Pen[color=" + color + ", type=" + type + "]";

    }
}
