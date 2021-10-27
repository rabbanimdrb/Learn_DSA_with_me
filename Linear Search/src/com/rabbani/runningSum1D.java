package com.rabbani;

import java.util.Arrays;

public class runningSum1D {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));

    }
    static int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        sum[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i]=nums[i]+sum[i-1];
        }


        return sum;
    }

}
