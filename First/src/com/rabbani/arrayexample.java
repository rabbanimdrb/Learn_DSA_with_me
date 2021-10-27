package com.rabbani;

public class arrayexample {

    public static void main(String[] args) {
        int[][] array_2D ={
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1},
        };


        for (int row = 0; row < array_2D.length; row++){

            for (int col = 0; col < (array_2D[row].length); col++) {
                System.out.print(array_2D[row][col] + "  ");
            }
            System.out.println();
        }
    }
}
