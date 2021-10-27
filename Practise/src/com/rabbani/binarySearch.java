package com.rabbani;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = search(arr, target);
        System.out.println(ans);
    }

   // function to search an element from a 1D array
    static int search(int[] arr,int target){
        int start=0;
        int end= arr.length-1;


        while (start<=end){

    int mid=start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]){
                end=mid-1;
            }
            else {
                //return answer
                return mid;
            }
        }
        return -1;


    }
}


