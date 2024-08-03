package com.piashraful;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        System.out.print("Enter your loan amount: " + "$");
        Scanner scanner = new Scanner(System.in);
        int loanAmount = scanner.nextInt();

        System.out.print("Enter the time period in years: ");
        int timePeriodInYear = scanner.nextInt();
        int timePeriodInMonth = timePeriodInYear * 12;

        final float annualInterestRate = 11.5f;
        final float monthlyInterestRate = annualInterestRate / 12 / 100;
        System.out.println("The monthly interest rate is: " + monthlyInterestRate);
        System.out.println("Do you want to take the loan: (yes/no) : ");
        String loanDecision = scanner.next().trim().toLowerCase();
        boolean isLoanTakable = loanDecision.equals("yes");

        if (isLoanTakable) {
            double mortgage = loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, timePeriodInMonth) /
                    (Math.pow(1 + monthlyInterestRate, timePeriodInMonth) - 1);

            System.out.printf("Your monthly mortgage payment is: $%.2f%n ", mortgage);

        } else {
            System.out.println("Loan declined");
        }

    }
}
