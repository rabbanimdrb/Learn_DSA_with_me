package com.rabbani;

public class maxInRange {

    public static void main(String[] args) {
        int[] arr={1,3,9,18,23};
        System.out.println(max(arr,1,3));
    }

    //imagine that arr is not empty
    static int max(int[] arr,int start,int end){
        int maxVal=arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
