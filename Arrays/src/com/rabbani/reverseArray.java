package com.rabbani;

import java.sql.Array;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start=0;
        int end = arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr2,int index1,int index2){
        int temp=arr2[index1];
        arr2[index1]=arr2[index2];
        arr2[index2]=temp;
    }
}
