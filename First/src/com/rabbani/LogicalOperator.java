package com.rabbani;

public class LogicalOperator {

    public static void main(String[] args) {

        //Logical Operator
        //&&
        int a = 80;
        int b = 40;
        if(a < 50 && b < 50) // && checks if both the condition is true or not, both conditions has to be satisfied
            System.out.println("Both less than 50");
        else
            System.out.println("Not less than 50");

        // ||

        if(a < 50 || b < 50) // Checks if any one conditions is satisfiesd or not.
            System.out.println("Atlest one is less than 50");

        // !

        boolean isKid = true;
        if(!isKid) // ! check it not a Kid
            System.out.println("is Kid");
        else
            System.out.println("Not Kid");
    }
}
