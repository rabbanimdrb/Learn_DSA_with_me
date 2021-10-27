package com.rabbani;

public class binarySearch {

    public static void main(String[] args) {

        int[] num= {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=22;
        int ans=binarySearch(num,target);
        System.out.println(ans);
    }


        //return index
        //return -1 if element not found
    static int binarySearch(int arr[],int target){
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            //find the middle element
            int mid = start + (end-start)/2;

            if (target<arr[mid]){
                //then see left
                end=mid-1;
            }
            else if(target>arr[mid]){
                //then see right
                start=mid+1;
            }
            else{
//                ans found
                return mid;
            }
        }

        return -1;
        

    }
}
