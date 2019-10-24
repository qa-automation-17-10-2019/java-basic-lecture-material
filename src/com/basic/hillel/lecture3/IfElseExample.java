package com.basic.hillel.lecture3;

/**
 * Created by alpa on 10/24/19
 */
public class IfElseExample {

    public static void main(String[] args) {

        int age = 17;
        int minAge = 18;

        if (age > minAge) {
            System.out.println("User logged in!");
        } else if (age == minAge) {
            System.out.println("User is 18 years old!");
        } else {
            System.out.println("Access denied!");
        }


    }
}
