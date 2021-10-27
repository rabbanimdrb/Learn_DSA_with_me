package com.rabbani;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopGame {

    public static void main(String[] args) {
        //LOOP GAME
        Scanner input = new Scanner(System.in);

        int number=0;
        do {
            System.out.print("Input a number");
            number = input.nextInt();
            System.out.println("Here's your number");
            System.out.println(number);
        }
        while (number>=0);

        System.out.println("THE END");
    }
}
