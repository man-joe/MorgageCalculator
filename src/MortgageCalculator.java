/*
Your assignment
Clean up the following code by adding comments where appropriate. If you read the program carefully you should be able
to follow it. Also, rename variables and methods to be meaningful and consistent.
 */

import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        //Variables needed
        Scanner keyboard = new Scanner(System.in);
        double loanAmt = 0;
        double interestRate = 0;
        double monthlyPayment = 0;
        double balance = 0;
        int termYears;

        //Read from User
        System.out.printf("Enter the loan amount: ");
        loanAmt = keyboard.nextDouble();

        System.out.printf("Enter the interest rate on the loan: ");
        interestRate = keyboard.nextDouble();

        System.out.printf("Enter the term (years) for the loan payment: ");
        termYears = keyboard.nextInt();

        System.out.printf("\n======================================\n");
        keyboard.close();
        // End Reading from User

        //Calculations
        monthlyPayment = calculateMonthlyPayment(loanAmt, interestRate, termYears);
        balance = -(monthlyPayment*(termYears*12));

        //Print balance and monthlyPayment
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", monthlyPayment);
    }


    //Calculates monthlyPayment
    public static double calculateMonthlyPayment(double loanAmt, double interestRate, int termYears) {
        // calculates the monthly payment 
        double rate = (interestRate/ 100) / 12;
        double base = (loanAmt + rate);
        double months = termYears* 12;
        double result = 0.0;
        result = ((rate * interestRate) / (1 - Math.pow(base, -months)));

        return result;
    }
}