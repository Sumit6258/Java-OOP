package com.sumit;

import java.util.Scanner;
public class Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What's your name?: ");
        String var = input.next();
        System.out.println("Hi! " + var + " ,nice to meet you.");
    }

}
