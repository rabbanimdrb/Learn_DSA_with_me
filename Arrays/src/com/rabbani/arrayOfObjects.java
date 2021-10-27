package com.rabbani;

import java.sql.Array;
import java.util.Arrays;

public class arrayOfObjects {
    public static void main(String[] args) {
        String[] str= {"bb", "aa", "cc", "dd"};

        System.out.println(str[3] + "  Element at 3rd index of array"); //prints element at index 3

        /**Outputs line 13 to 27*/
        /* print array "arr" using for loop */
        System.out.println("Printed using for loops");

        for (int index = 0; index < str.length; index++) {
            System.out.print(str[index] + " ");
        }
        System.out.println();

        /* print array "arr" using 'Arrays.toString' */
        System.out.println("Printed using Arrays.toString()");
        System.out.println(Arrays.toString(str));

        /*print array using enhanced for loops*/
        System.out.println("Printed using enhanced for loops");
        Arrays.stream(str).map(a -> a + " ").forEach(System.out::print);//Kunal did not cover this


    }

}
