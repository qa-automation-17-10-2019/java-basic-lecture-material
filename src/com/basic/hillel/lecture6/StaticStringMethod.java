package com.basic.hillel.lecture6;

/**
 * Created by alpa on 11/7/19
 */
public class StaticStringMethod {

    public static void main(String[] args) {
        String name = new String("Martin");
        int age = 30;

        String stringAge = String.valueOf(age);
        System.out.println(stringAge);

        System.out.println(String.format("Result %s, %s", 30.0, "Bob"));

        String[] students = {"Mark", "Igor", "Anna"};

        String join = String.join(",", students);
        System.out.println("Students: " + join);
    }

    public static void formatString(String[] args, int data) {

    }

    public static void formatString2(int data, String... args) {

    }
}
