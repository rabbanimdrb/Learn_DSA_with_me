package com.rabbani;

public class shuffleArray {
    public static void main(String[] args) {
        int[] arr={1,3,9,4,6,7};
        shuffle(arr);
    }

    static int[] shuffle(int[] arr) {
        int n= arr.length;
        int[] newArr=new int[2*n];

        for (int i = 0; i < n; i++) {
            newArr[i]=arr[i];

        }
        return newArr;

    }
}
