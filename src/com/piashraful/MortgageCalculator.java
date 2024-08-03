package com.piashraful;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        byte MONTHS_IN_YEAR = 12;
        byte PERCHANT = 100;
        System.out.print("Enter your loan amount: " + "$");
        Scanner scanner = new Scanner(System.in);
        int loanAmount = scanner.nextInt();

        System.out.print("Enter the time period in years: ");
        int timePeriodInYear = scanner.nextInt();
        int timePeriodInMonth = timePeriodInYear * 12;

        final float annualInterestRate = 11.5f;
        final float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCHANT;
        System.out.println("The monthly interest rate is: " + monthlyInterestRate);
        System.out.println("Do you want to take the loan: (yes/no) : ");
        String loanDecision = scanner.next().trim().toLowerCase();
        boolean isLoanTakable = loanDecision.equals("yes");

        if (isLoanTakable) {
            double mortgage = loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, timePeriodInMonth) /
                    (Math.pow(1 + monthlyInterestRate, timePeriodInMonth) - 1);
            String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

            System.out.println("Your monthly mortgage payment is: " + formattedMortgage);

        } else {
            System.out.println("Loan declined");
        }

    }
}
