package com.rabbani;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
     static void swap(int[] arr2,int index1,int index2){
        int temp=arr2[index1];
        arr2[index1]=arr2[index2];
        arr2[index2]=temp;
    }
}
