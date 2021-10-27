package com.rabbani;

public class minElementInArray {
    public static void main(String[] args) {
        // Search min elemnet and return index
        int[] arr={1,2,3,4,5,6,7,8,9,-8888};
        int ans=minElement(arr);
        System.out.println(ans);
    }

    static int minElement(int[] arr) {
        //search min element and return index
        //return -1 if arr.length==0
        if (arr.length==0){
            return -1;
        }

        int minValue=arr[0]; //arr[0] or Integer.MAX_VALUE
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]<minValue){
                minValue=arr[index];
            }

        }
        return minValue;
    }
}
