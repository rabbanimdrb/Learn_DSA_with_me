package com.rabbani;

public class max {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        System.out.println(max(arr));
    }

    //imagine that arr is not empty
    static int max(int[] arr){
        int maxVal=0;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]>maxVal){
                maxVal=arr[index];
            }
        }
        return maxVal;
    }
}
