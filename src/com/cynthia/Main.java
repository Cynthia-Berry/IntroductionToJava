package com.cynthia;

import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        /*FORMATTING NUMBERS*/
        //for formatting number as currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String output = currency.format(1234567.891);
        System.out.println(output);

        //OR

        String setCurrency = NumberFormat.getCurrencyInstance().format(1234567.891);
        System.out.println(setCurrency);

        //for formatting numbers as Percentages
        String percent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percent);

        /*READING INPUT*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        byte setAge = scanner.nextByte();
        System.out.println("You are " + setAge + " years old");

        //DIFFERENTIATING BETWEEN next() and nextLine()
        //next() takes only one string, say only firstname (even when full name is typed
        // but nextLine() gets all the input strings
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine().trim(); //this is better because it removes excess white space in front
        System.out.println("You are " + name);

        /* ************Task 1************* */
        /* ************SUM OF NUMBERS FROM 1 TO 10************* */
        int n=10;
        double i;
        double sum = 0;

            // ***FOR LOOP***

             for( i=1; i <= n; i++){
                sum += i;
            }
         System.out.println("The sum of numbers from 1 to 10 is " + sum);

            // ***WHILE LOOP***

                /*while (i <= n){
                     sum += i;
                     i++;
                 }*/

            // ***DO... WHILE LOOP***
            /*do{
                sum += i;
                i++;
            }while(i < n);*/



        /*COLLECTING INPUT (STRICTLY FROM 1 TO 10) FROM USER AND FINDING THE SQUARE*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10");
        i = input.nextDouble();
        if (i>10){
            System.out.println("Only digits from 1 to 10 is allowed");
        }else{
            double square = Math.pow(i, 2);
            System.out.println("Square of "+ i + " is: "+ square);
        }
        // closing the scanner object
        input.close();

        /* ********** FIZZBUZZ PUZZLE ********** */
        Scanner set = new Scanner(System.in);

        //GET INPUT FROM USER
        System.out.print("Number: ");
        byte number = set.nextByte();

        //CONDITIONAL STATEMENT USING IF
        if( (number % 3) == 0 && (number % 5) == 0 ){
            System.out.println("FIZZBUZZ");
        }
        else if( (number % 5) == 0 ){
            System.out.println("FIZZ");
        }
        else if( (number % 3) == 0 ) {
            System.out.println("BUZZ");
        }
        else{
            System.out.println(number);
        }


    }

}
