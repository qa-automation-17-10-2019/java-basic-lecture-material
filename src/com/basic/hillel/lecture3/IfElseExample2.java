package com.basic.hillel.lecture3;

/**
 * Created by alpa on 10/24/19
 */
public class IfElseExample2 {

    public static void main(String[] args) {
        String userName = "John";
        int age = 30;
//
//        String userName = "Anna";
//        int age = 18;

        int value = 1;

        if (age >= 18) {
            if (userName.equals("Mark")) {
                System.out.println("Hello Mark!");
            } else if (userName.equals("Victor")) {
                System.out.println("Hello Victor!");
            } else if (userName.equals("John1")) {
                System.out.println("Hello John!");
            } else if (userName.equals("Anna")) {
                System.out.println("Hello Sara!");
                value = 10;
            } else if (userName.equals("Anna")) {
                System.out.println("Hello Anna!");
                value = 5;
            } else if (userName.equals("Victor") || userName.equals("John")) {
                System.out.println("Hello there!");
                value = 5;
            } else {
                System.out.println("Hello unknown user!");
            }
        } else {
            System.out.println("Access denied!");
        }

        System.out.println(value);

    }
}
