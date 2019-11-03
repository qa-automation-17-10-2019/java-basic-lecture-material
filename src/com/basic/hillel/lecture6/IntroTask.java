package com.basic.hillel.lecture6;

import java.util.Random;

/**
 * Created by alpa on 11/3/19
 */
public class IntroTask {

    public static void main(String[] args) {
//        System.out.println(Math.random());
//        System.out.println(Math.random());
//        System.out.println(Math.random());
//        System.out.println(Math.random());
//        Random random = new Random();
//        System.out.println(random.nextInt(10));
//        System.out.println(random.nextInt(20));
//        System.out.println(random.nextInt(30));
//        System.out.println(random.nextInt(40));

        System.out.println("Random: " + getRandomFromRange(10, 15));
    }

    public static int getRandomFromRange(int min, int max) {
        Random rnd = new Random();

        int number = min + rnd.nextInt(max - min + 1);

        return number;
    }
}
