package com.cynthia;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    static class MortgageCalc{
        final byte month_in_year = 12;
        final byte percent = 100;
        int principal = 0;
        float monthlyInterest = 0;
        double numberOfPayments = 0;

        //INITIALIZING THE SCANNER TO RECEIVE USER INPUT
        final Scanner input = new Scanner(System.in);

        // A METHOD TO GET PRINCIPAL INPUT FROM USER
        void setPrincipal(){
            while(true){
                System.out.print("Principal ($1,000 - $1,000,000): ");
                principal = input.nextInt();
                if (principal >= 1000 && principal <= 1_000_000){
//                        principal =newValue;
                    break;
                }
                System.out.println("Enter a number between 1,000 and 1,000,000");
            }
        }

        // A METHOD TO GET ANNUAL INTEREST  INPUT FROM USER
        // AND CONVERT THIS INTEREST TO MONTHLY INTEREST
        void setMonthlyInterest(){
            while(true){
                System.out.print("Annual Interest Rate: ");
                float annualInterest = input.nextFloat();
                if( annualInterest > 0 && annualInterest <= 30){
                    monthlyInterest = (annualInterest/percent)/month_in_year;
                    break;
                }
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            }
        }

        // A METHOD TO GET TIME(YEARS) INPUT FROM USER
        void setNumberOfPayments(){
            while (true) {
                System.out.print("Period (Years): ");
                byte time = input.nextByte();
                if(time >=1 && time <= 30){
                    numberOfPayments = time * month_in_year;
                    break;
                }
                System.out.println("Enter a value between 1 and 30");
            }
        }

        //IMPLEMENTING THE MORTGAGE FORMULAE
        void setMortgage(){
            //CALCULATION
            double numerator = monthlyInterest * Math.pow((1 + monthlyInterest),numberOfPayments);
            double denominator = Math.pow((1 + monthlyInterest),numberOfPayments) - 1;
            double mortgage = principal * ((numerator)/(denominator));

            //FORMATTING THE MORTGAGE TO CURRENCY
            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage: ".concat(mortgageFormatted));
        }
    }
    public static void main (String[] args){
        /* **********MORTGAGE PAYMENT CALCULATOR********** */
        /* **********ENHANCING THE MORTGAGE CALCULATOR BY ADD ERROR HANDLING CONDITIONS********** */


        //CREATING AN INSTANCE OF THE CLASS MORTGAGE CALCULATOR
        MortgageCalc cynthiaMortgage = new MortgageCalc();
        cynthiaMortgage.setPrincipal();
        cynthiaMortgage.setMonthlyInterest();
        cynthiaMortgage.setNumberOfPayments();
        cynthiaMortgage.setMortgage();

    }
}
