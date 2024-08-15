package com.piashraful;

public class Discount {

    public double calculateDiscount(int quantity, double unitPrice) {
        double discount = 0.0;

        if (quantity > 100) {
            discount = 0.2;
        } else if (quantity > 50) {
            discount = 0.1;
        }

        return unitPrice * (1 - discount);
    }

    public static void main(String[] args) {
        Discount discountCalculator = new Discount();


        double result1 = discountCalculator.calculateDiscount(-10, 100.00);
        double result2 = discountCalculator.calculateDiscount(150, 100.00);

        System.out.println("Discounted price for 50 items: $" + result1);
        System.out.println("Discounted price for 150 items: $" + result2);
    }
}

