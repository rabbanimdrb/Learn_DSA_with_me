package com.rabbani;

import java.sql.Array;
import java.util.Arrays;

public class arrayUsingFunction {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num){
        num[0]=99;
    }
}
