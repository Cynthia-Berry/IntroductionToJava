package com.cynthia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String message= "Hello World";
        System.out.println(message.toUpperCase());

        /* ************Task 1************* */
        /* ************SUM OF NUMBERS FROM 1 TO 10************* */
        class ArithemeticOperation {
            double i=1;
            void squareOfNumbers (){
              double  sumOfSqu = Math.pow(i,2);
            }

            void sumOfNumbers (){
                double  sum = sum + i;
            }
        }
        ArithemeticOperation forLoop = new ArithemeticOperation();
        int n=10;
        double i=1;
        double sum = 0;

            // ***FOR LOOP***

             for( i=1; i <= 10; i++){
                 forLoop.sumOfNumbers();
            }
         System.out.println("The sum of numbers from 1 to 10 is " + sum);


        /* ************Task 3************* */
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

    }

}
