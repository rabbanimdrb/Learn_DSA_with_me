package com.rabbani;

public class Linear_Search_Algorithm {

    public static void main(String[] args) {

        int [] nums={23,45,89,26,89,65,-8};
        int target = 65;

        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }

    //Search the item in the array and return index if it found
    //otherwise if item not found return -1

    static int linearSearch(int[] arr, int target){

        if (arr.length==0){
            return -1;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check element at every index if it is == target
            int element=arr[index];

            if (element==target){
                return index;
            }

        }

        //this line will execute if none of the return  statements above have executed
        //hence the target not found
        return -1;
    }
}
