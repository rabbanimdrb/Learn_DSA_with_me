package com.rabbani;

import java.util.Scanner;

public class arrayexample2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array2D=new int[3][3];

        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {

                array2D[row][col]= input.nextInt();

                System.out.print(array2D[row][col] + "  ");
            }
            System.out.println();
            
        }

    }
}
