package com.rabbani;

public class tryyy {

    // Driver Code

    public static void main(String[] args)

    {

//        char letters[] = { 'A', 'r', 'z' };
//
//        char K = 'z';
//
//        char result = nextGreatestAlphabet(letters, K);

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

        char ans1=nextGreatestAlphabet(arr1,target1);
        char ans2=nextGreatestAlphabet(arr2,target2);
        char ans3=nextGreatestAlphabet(arr3,target3);
        char ans4=nextGreatestAlphabet(arr4,target4);
        char ans5=nextGreatestAlphabet(arr5,target5);


        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(ans5);


        // Function call

        //System.out.println(result);

    }

    /* Returns the smallest character from the given

    set of letters that is greater than K */

    static char nextGreatestAlphabet(char letters[], char target)

    {

        int n = letters.length;

        if(target>=letters[n-1])

            return letters[0];


        int start = 0, end = letters.length - 1;



        int ans = -1;

        // Take the first element as start and

        // the rightmost element as end

        while (start <= end)

        {

            // if this while condition does not

            // satisfy simply return the first

            // element.

            int mid = (start + end) / 2;

            if (letters[mid] > target)

            {

                end = mid - 1;

                ans = mid;

            }

            else

                start = mid + 1;

        }


        // Return the smallest element

        return letters[ans];

    }

}
