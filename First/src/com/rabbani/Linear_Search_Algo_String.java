package com.rabbani;

public class Linear_Search_Algo_String {
    public static void main(String[] args) {

        String name="Rabbani";
        char target='a';
//        boolean ans=linearSearchInStrings(name,target);
//        System.out.println(ans);
        //OR
        System.out.println(linearSearchInStrings(name,target));
    }

    static boolean linearSearchInStrings(String str,char target){

        if (str.length()==0){
            return false;
        }

        //LOOP
        for (int index = 0; index < str.length(); index++) {
            if (target==str.charAt(index)){
                return true;
            }
        }

        return false;

    }

}
