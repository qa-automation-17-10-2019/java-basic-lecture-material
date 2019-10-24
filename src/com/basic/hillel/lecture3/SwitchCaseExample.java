package com.basic.hillel.lecture3;

/**
 * Created by alpa on 10/24/19
 */
public class SwitchCaseExample {

    public static void main(String[] args) {
        int age = 18;

        switch (age) {
            case 18:
                System.out.println("Access denied!");
            case 30:
                System.out.println("Hello user!");
                break;
            case 31:
                System.out.println("Hey hey!");
                break;
        }

        String user = "John1";

        switch (user) {
            case "Sara":
                System.out.println("Access denied!");
                break;
            case "John":
                System.out.println("Hello user: " + user);
                break;
            case "Mark":
                System.out.println("Hey hey!");
                break;
            default:
                System.out.println("Hey hey");
        }

    }




}
