package com.rabbani;

import java.util.Arrays;

public class findElement2D {
    //find element in 2D array and return index
    public static void main(String[] args) {
        int[][] arr={
                {2,4,6},
                {3,6,9},
                {7,14,21},
        };
        int target=14;

        int[] ans=linearSearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] linearSearch(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(target==arr[row][col]){
                    return new int[]{row,col};
                }

            }
        }
        return new int[]{-1, -1};
    }

}
