package com.rabbani;

public class Linear_Search_Algo_2 {
    public static void main(String[] args) {
        int[] nums= {2,5,8,9,6,3,7,4,1,0};
        int target=7;
        boolean ans=linearSearch(nums,target);
        System.out.println(ans);

    }

    //function for linear search in an array and return true if the element exist
    static boolean linearSearch( int[] arr,int target){

        if (arr.length==0){
            return false;
        }

        //run for loop to search the element in a range let suppose from index 2 to 8
        for (int element : arr) {

            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
