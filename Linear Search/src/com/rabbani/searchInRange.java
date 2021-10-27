package com.rabbani;

public class searchInRange {
    public static void main(String[] args) {
        int arr[]={2,8,9,12,-20,-3,18,6};
        int target=-20;
        System.out.println(search(arr,target,1,4));
    }

    static int search(int[] arr, int target,int start,int end) {
        if (arr.length==0){
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if (target==arr[index]){
                return index;
            }
        }
        return -1;
    }
}
