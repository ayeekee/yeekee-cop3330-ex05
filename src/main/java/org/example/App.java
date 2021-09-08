package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner se = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String in1 = se.nextLine();

        System.out.print("What is the second number? ");
        String in2 = se.nextLine();

        int num1 = Integer.parseInt(in1);
        int num2 = Integer.parseInt(in2);

        int sum = num1 + num2;
        int dif = num1 - num2;
        int pro = num1 * num2;
        int quo = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + sum + "\n" + num1 + " - " + num2 + " = " + dif + "\n" + num1 + " * " + num2 + " = " + pro + "\n" + num1 + " / " + num2 + " = " + quo);
    }
}
