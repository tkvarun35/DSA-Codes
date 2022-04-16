package com.Javalearn;

import java.util.Scanner;

public class bitmasking {
    public static void main(String[] args) {
        int n,m,l;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number:-");

        n= input.nextInt();
        System.out.print("Enter the bit place:-");
        l=input.nextInt();
        m=1<<l;
        if ((n&m)==1){
            System.out.println("The number is 1 at the position.");
        }
        else {
            System.out.println("The number is 0 at the place.");
        }



    }
}
