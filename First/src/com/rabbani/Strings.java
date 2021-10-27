package com.rabbani;

public class Strings {

    public static void main(String[] args) {
        //Strings
        //Concatenate
        String name1 = "Rabbani";
        String name2 = "Koysor";
        String  name = name1 + " and " + name2;

        System.out.println(name);

        //charAt

        String name3  = "Imran";
        System.out.println(name3.charAt(0)); //Gives the character at zeroth index of string name3

        //length

        System.out.println(name3.length());

        //replace

        String name4 = name.replace('a','b');
        System.out.println(name4);

        //Sub String

        String name5 = "Rabbani and Koysor";
        System.out.println(name.substring(0,8));


    }
}
