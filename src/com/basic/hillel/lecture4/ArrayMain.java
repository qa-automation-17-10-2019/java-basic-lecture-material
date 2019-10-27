package com.basic.hillel.lecture4;

/**
 * Created by alpa on 10/27/19
 */
public class ArrayMain {

    public static void main(String[] args) {
        int[] array = new int[5];
        int[] salary = { 1, 3, 5, 6456, 674, -45 };

        System.out.println("Salary length: " + salary.length);
        int elementTwo = salary[1];

        System.out.println("elementTwo: " + elementTwo);

//        int elementSeven = salary[6];
        salary[1] = 7;
        int elementTwoNew = salary[1];
        System.out.println("elementTwoNew: " + elementTwoNew);
        System.out.println("salary: " + salary);


        array[2] = 2;
        int elementThree = array[2];
        System.out.println("elementThree: " + elementThree);


    }

}
