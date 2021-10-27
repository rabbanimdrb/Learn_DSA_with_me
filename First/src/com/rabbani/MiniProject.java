package com.rabbani;

import java.util.Scanner;

public class MiniProject {

    public static void main(String[] args) {
        //MINI PROJECT
        Scanner input = new Scanner(System.in);

        int myNumber = (int)(Math.random()*100);
        int userNumber=0;

        do {
            System.out.print("Guess a number between (1 to 100)  :  ");
            userNumber=input.nextInt();

            if (userNumber==myNumber){
                System.out.println("WOOOHOOOOOO!!! You have got it ryt ");
                break;
            }


            else if (userNumber>myNumber){

                System.out.println("Number is too large");
            }

            else {
                System.out.println("Number is too small");
            }
        }
        while (userNumber>=0);

        System.out.println("My Number was : ");
        System.out.println(myNumber);
    }
}
