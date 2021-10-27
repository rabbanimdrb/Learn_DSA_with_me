package com.rabbani;

public class SwitchStatement {
    public static void main(String[] args) {
        //Switch Statement
        int day=2; //Mon-1, Tue-2 and so on
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wed to Sun");
        }
    }
}
