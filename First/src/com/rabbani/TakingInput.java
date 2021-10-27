package com.rabbani;

import java.util.Scanner;

public class TakingInput {

    public static void main(String[] args) {

        //How to take input
        Scanner input = new Scanner(System.in);

        System.out.println("What's your age:");
        int age = input.nextInt();  //Integer Input
        System.out.println("Your age is " +  age);

        String name = input.next(); //Takes input //Only single word
        
        System.out.println(name);

    }
}
