package com.rabbani;

import java.util.Scanner;

public class ceilingBS {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 11, 12};
        int target = 8;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

        static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid=start + (end-start)/2;

        while (start<=end){
            if (target>arr[mid]){
                start=mid+1;
            }
            else {
                if (target < arr[mid]) {
                    end = mid - 1;
                }
            }
                return mid;

            }
        }
        return -1;//ans not found

    }

//    static int ceiling(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
//
//            int mid = start + (end - start) / 2;
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else {
//                if (target <= arr[mid]) {
//                    return mid;
//                }
//
//                start = mid + 1;
//            }
//        }
//
//        return -1;

//    }
}
