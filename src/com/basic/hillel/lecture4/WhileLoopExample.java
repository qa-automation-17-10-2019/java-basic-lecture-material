package com.basic.hillel.lecture4;

/**
 * Created by alpa on 10/27/19
 */
public class WhileLoopExample {

    public static void main(String[] args) {

//        boolean isStarted = true;
//
//        while (isStarted) {
//            System.out.println("hey");
//            isStarted = false;
//        }

        int min = 1;
        int max = 10;

//        while (min <= max) {
//            System.out.println("min: " + min + ", max: " + max);
////            min = min + 1;
////            min++;
////            max = max -1;
//            max--;
//        }
        boolean isStarted = true;
        while (isStarted) {
            System.out.println("min: " + min + ", max: " + max);
            if (min == 5) {
                isStarted = false;
            }
            min++;
        }

    }
}
