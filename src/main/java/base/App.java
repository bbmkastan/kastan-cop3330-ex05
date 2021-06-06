package base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Bao Kastan
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int num1 = myApp.getNum1();
        int num2 = myApp.getNum2();

        myApp.doCaculations(num1, num2);
    }

    public int getNum2() {
        System.out.println("What is the second number?");
        String num = in.nextLine();
        int num2 = Integer.parseInt(num);
        return num2;
    }

    public int getNum1() {
        System.out.println("What is the first number?");
        String num = in.nextLine();
        int num1 = Integer.parseInt(num);
        return num1;
    }

    public void doCaculations(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
