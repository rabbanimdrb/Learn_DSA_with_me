package com.rabbani;

public class letterTarget {
    public static void main(String[] args) {
//        char[] arr={'a','d','e'};
//        char target='d';
        char[] arr1={'c','f','j'};
        char target1='a';
        char[] arr2={'c','f','j'};
        char target2='c';
        char[] arr3={'c','f','j'};
        char target3='d';
        char[] arr4={'c','f','j'};
        char target4='g';
        char[] arr5={'c','f','j'};
        char target5='j';
        //char ans=letter(arr,target);
        char ans1=letter(arr1,target1);
        char ans2=letter(arr2,target2);
        char ans3=letter(arr3,target3);
        char ans4=letter(arr4,target4);
        char ans5=letter(arr5,target5);

        //System.out.println(ans);
        System.out.println(ans1);
//        "c"
//        "f"
//        "f"
//        "j"
//        "c"
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(ans5);

    }

    static char letter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;

        if (target>=letters[end]){
            return letters[0];
        }

        int ans=-1;
        while (start<=end){
            int mid=start + (end-start)/2;



            if (target>letters[mid]){
                start = mid+1;
            }
            else {
                end=mid-1;
                ans = mid;
            }

        }
        return letters[start]; // % letters.length
    }
}
