package com.basic.hillel.lecture4;

/**
 * Created by alpa on 10/27/19
 */
public class ForLoopExample {

    public static void main(String[] args) {
        String[] students = {"Steve", "Igor", "Anna", "Viktor", "Bob"};

//        for (int i = 0;i < students.length;i++) {
//            System.out.println("i:" + i);
//            System.out.println("Student: " + students[i]);
//        }

        for (int i = 0;i < students.length;i= i+2) {
            System.out.println("i:" + i);
            System.out.println("Student: " + students[i]);
        }
    }
}
