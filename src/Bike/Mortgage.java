package Bike;

import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal:");
        int principal = input.nextInt();

        System.out.println("Enter the Annual interest rate:");
        float annualInterestRate = input.nextInt();

        System.out.println("Enter the loan period(in years:");
        int years = input.nextInt();
        int numberOfMonths = years * 12;
        int MONTH_IN_A_YEAR = 12;
        float monthlyRate = (annualInterestRate /100) / MONTH_IN_A_YEAR;
        double mortgagePayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths))
                / (Math.pow(1 + monthlyRate, numberOfMonths) - 1);
        System.out.printf("Your monthly mortgage payment is $%.2f", mortgagePayment);














    }
}
