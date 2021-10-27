package com.rabbani;

import java.util.Arrays;

public class findElementin2D_2 {

    public static void main(String[] args) {
        int[][] arr={
                {2,4,6},
                {3,6,9},
                {7,14,21},
        };
        int target=14;

        boolean ans=linearSearch(arr,target);
        System.out.println(ans);
    }

    static boolean linearSearch(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(target==arr[row][col]){
                    return true;
                }

            }
        }
        return false;
    }
}
