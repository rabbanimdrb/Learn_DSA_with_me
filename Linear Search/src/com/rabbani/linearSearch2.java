package com.rabbani;

public class linearSearch2 {
    public static void main(String[] args) {
        // Search target and return index
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int target=11;
        int ans=linearSearch(arr,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        //search target and return element
        //if element not found return Integer.MIN_VALUE
        //if arr has no element return Integer.MIN_VALUE
        if(arr.length==0){
            return -1; //-1 or Integer.MIN_VALUE
        }

        for (int index = 0; index < arr.length; index++) {
            //iterate through all the element and search for the target
            //int element = arr[index];
            if (target==arr[index]){
                return target;
            }
        }
        return Integer.MIN_VALUE;
    }
}
