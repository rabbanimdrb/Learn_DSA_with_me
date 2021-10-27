package com.rabbani;

public class findElementInString {

    public static void main(String[] args) {


        String str="Rabbani";
        char target='R';
        boolean ans=linearSearch(str,target);
        System.out.println(ans);
    }

     static boolean linearSearch(String str, char target) {

         if(str.length()==0){
             return false;
         }

         for (int index = 0; index < str.length(); index++) {
             if(target==str.charAt(index)){
                 return true;
             }

         }
         return false;

         /** Above for loop can also be written as below*/

         /* for (int index = 0; index < str.length(); index++) {
             if(target==str.charAt(index)){
                 return true;
             }

         }
         return false;*/


     }
}
