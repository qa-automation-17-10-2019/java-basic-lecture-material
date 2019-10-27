package com.basic.hillel.lecture4;

/**
 * Created by alpa on 10/27/19
 */
public class ArrayOfArray {

    public static void main(String[] args) {
//        int[][] array = new int[3][3];
        int[][] array = {{1,3,6}, {5,6,7}};

        int[] a = array[1];
        int b = array[1][1];
        System.out.println(a[1]);
        System.out.println(b);
    }
}
