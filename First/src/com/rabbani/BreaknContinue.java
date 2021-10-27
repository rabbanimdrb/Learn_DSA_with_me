package com.rabbani;

public class BreaknContinue {

    public static void main(String[] args) {
        //BREAK and CONTINUE

        int i=0;
        while (true){
            if (i==3){
                i++;
                continue;
            }

            System.out.println(i);
            i++;
            if (i>5){
                break;
            }

        }
    }
}
