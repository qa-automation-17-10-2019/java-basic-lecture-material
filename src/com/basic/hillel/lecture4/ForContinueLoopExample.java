package com.basic.hillel.lecture4;

/**
 * Created by alpa on 10/27/19
 */
public class ForContinueLoopExample {

    public static void main(String[] args) {
        String[] students = {"Steve", "Igor", "Anna", "Viktor", "Bob"};

        for (int i = 0;i < students.length;i++) {
            System.out.println("i:" + i);
            String student = students[i];
            if (student.equals("Viktor")) {
//                continue;
                break;
            }
            System.out.println("Student: " + student);
        }
    }

}
