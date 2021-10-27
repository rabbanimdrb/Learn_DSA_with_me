package com.rabbani;

import java.util.Scanner;

public class ConditionalStatement2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Pen is 10 and copy is 40

        int cash = input.nextInt();

        if(cash<10){
            System.out.println("Cannot buy anything");
            System.out.println("Get more cash");
        }

        else if (cash > 10 && cash < 50) {
            System.out.println("Can buy 1 the thing");
        }

         else {
            System.out.println("Can buy both the thing");
        }
    }
}
