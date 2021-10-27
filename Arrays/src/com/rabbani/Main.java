package com.rabbani;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        /**Outputs line 10 to 33*/
        /*declare and initialise of 1D array "arr"*/
        int[] arr={1,2,3,4,5,6,7,8,9};

        System.out.println(arr[3] + "  Element at 3rd index of array"); //prints element at index 3

        /* print array "arr" using for loop */
        System.out.println("Printed using for loops");

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println();


        /* print array "arr" using 'Arrays.toString' */
        System.out.println("Printed using Arrays.toString()");
        System.out.println(Arrays.toString(arr) + " ");

        /*print array using enhanced for loops*/
        System.out.println("Printed using enhanced for loops");
        for (int a :
                arr) {

            System.out.print(a + " ");
        }
        System.out.println();
        /**Inputs line 00 to 00*/
        /* print array "arr" using for loop */
        System.out.println("Input using for loops");

        int[] arr1=new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=in.nextInt();

            System.out.print(arr1[i]+" ");
        }

        //modify str[0]
        //str[1]="kunal";

    }
}
