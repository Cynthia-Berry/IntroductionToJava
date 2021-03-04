package com.cynthia;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Introduction {
    public static void main(String[] args) {
        //1)     PRIMITIVE DATA TYPE
        byte age = 30;
        int viewsCount = 123_456_789;
        long viewsCounter = 3_123_456_789L;
        float littleAmount = (float) 23.23;
        System.out.println(age);
        System.out.println(viewsCount);
        System.out.println(viewsCounter);
        System.out.println(littleAmount);

        //        or
        float littleAmt = 23.23F;
        double largeAmount = 23.13;
        System.out.println(littleAmt);
        System.out.println(largeAmount);

        //   Char represents one character  and uses single quotes
        // while string represents multiple letters and uses double quotes
        char letter = 'A';
        System.out.println(letter);



        //2)      REFERENCE DATA TYPE
              /*  1.  this requires you to import the class from another package
                  2. We allocate memory by using the "new" keyword
                  3. the variable name is an instance of the class Date()
	     */
        Date now = new Date();
        System.out.println(now);

        // Samples on primitive DT
        byte x = 2;
        byte y = x;
        x =45;
        System.out.println(x);
        System.out.println(y);

        // Samples on Reference DT
        Point point1 = new Point(2,2);
        Point point2 = point1;
        point1.y = 5;
        System.out.println(point2);

        // ARRAY
        int[] numbers = new int[5];
        numbers[0] = 3;
        numbers[1] = 6;
        numbers[2] = numbers[1] * 3;
        System.out.println(Arrays.toString(numbers));
        //OR
        int[] number = { 2,32,1,5,16};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));


        // MULTI-DIMENSIONAL ARRAY (n * n Matrics)
        int[][] nums = new int[2][2];
        nums[0][0]=1;
        System.out.println(Arrays.deepToString(nums));
        //OR
        int[][] numbs = {{1,2,3}, {4,5,6}};
        numbs[0][0]=1;
        System.out.println(Arrays.deepToString(numbs));

        // TO DECLARE A CONSTANT VARIABLE ( use the "FINAL" keyword )
        final float pi = 3.14F;
        System.out.println(pi);

        //ARITHMETIC OPERATORS
            /*       + addition ,
		- subtraction,
		/ division (only gives whole number without remainder make sure to prefix with (double),
		* multiplication,
		% modulus
          	++ increment operator (can be used both as a postfix or prefix), e.g ++x <=> x++ when used without assigning to another variable
            	-- decrement operator (can be used both as a postfix or prefix)
          	x =+ anyNumb <=> x = x + anyNumb
            	Java uses BODMAS for operation order
	    */
        double result = (double)10/ (double)3;
        System.out.println(result);
        int a = 1;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // CASTING
        String c = "12";
        int d = Integer.parseInt(c) + 3;
        System.out.println(d);
    }
}
