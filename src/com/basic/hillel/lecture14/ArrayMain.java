package com.basic.hillel.lecture14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alpa on 12/5/19
 */
public class ArrayMain {

    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList();
        System.out.println(listOfStrings.size());
        System.out.println("isEmpty: " + listOfStrings.isEmpty());
        listOfStrings.add("yellow");
        listOfStrings.add("green");
        listOfStrings.add("red");
        listOfStrings.add("brow");
        System.out.println("size: " + listOfStrings.size());
        listOfStrings.remove("green");
        System.out.println("size: " + listOfStrings.size());

        boolean isContainsBlue = listOfStrings.contains("blue");
        System.out.println("isContainsBlue: " + isContainsBlue);

        boolean isContainsGreen = listOfStrings.contains("yellow");
        System.out.println("isContainsBlue: " + isContainsGreen);

        String index2 = listOfStrings.get(1);
        System.out.println("index2: " + index2);
        System.out.println("toString: " + listOfStrings.toString());
        System.out.println("isEmpty: " + listOfStrings.isEmpty());

//        listOfStrings.removeIf(item -> item.equals("yellow"));

        ArrayList<String> listOfStrings2 = new ArrayList();
        listOfStrings2.add("yellow");
        listOfStrings2.add("brow");

        listOfStrings.removeAll(listOfStrings2);

        System.out.println("listOfStrings: " + listOfStrings.size());

        for (String string : listOfStrings) {
            System.out.println(string);
        }

//        listOfStrings.forEach(System.out::println);
        listOfStrings.set(0, "dfsdfdf");


        listOfStrings.add(listOfStrings.size() , "345345");

        System.out.println(listOfStrings.toString());


    }
}
