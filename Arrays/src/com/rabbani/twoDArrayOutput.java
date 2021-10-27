package com.rabbani;

import java.util.Arrays;

public class twoDArrayOutput {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //Output using for loops
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
        System.out.println();
        }

        //Output using enhanced for loops
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
            }
            System.out.println();

        //Output using Array.toString
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println();

        }

    }
