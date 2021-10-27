package com.rabbani;



public class maxIn2D {
    //max element in 2D array and return element
    public static void main(String[] args) {
        int[][] arr={
                {2,4,6},
                {3,6,9},
                {7,14,21},
        };

        int ans=max(arr);
        System.out.println(ans);
    }

    static int max(int[][] arr) {

        int maxValue=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (maxValue<arr[row][col]){
                    maxValue=arr[row][col];

                }
            }
        }
        return maxValue;
    }

}
