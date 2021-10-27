package com.rabbani;

public class Main {

    public static void main(String[] args) {
	// Search target and return index
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int target=7;
        int ans=linearSearch(arr,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        //search target and return index
        //if element not found return -1
        //if arr has no element return -1
        if(arr.length==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            //iterate through all the element and search for the target
            //int element = arr[index];
            if (target==arr[index]){
                return index;
            }
        }
        return -1;
    }
}
