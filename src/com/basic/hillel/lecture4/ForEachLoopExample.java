package com.basic.hillel.lecture4;

/**
 * Created by alpa on 10/27/19
 */
public class ForEachLoopExample {

    public static void main(String[] args) {

        int[] numbers = {1,35, 5673, 234, 234267, 9};

        for (int number: numbers) {
            System.out.println("number: " + number);
            if (number == 5673) {
                System.out.println("hey!");
            }
        }

        String[] students = {"Steve", "Igor", "Anna", "Viktor", "Bob"};

        for (String student: students) {
            System.out.println(student);
        }

    }
}
