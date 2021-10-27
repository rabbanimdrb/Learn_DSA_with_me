package com.rabbani;

import java.util.Arrays;
import java.util.Scanner;

public class twoDArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[][] = new int[3][3];
        //Input using for loops
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

                System.out.print(arr[row][col] + " ");//output the array
            }

        }
    }
}

