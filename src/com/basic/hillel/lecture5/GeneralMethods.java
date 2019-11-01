package com.basic.hillel.lecture5;

/**
 * Created by alpa on 10/31/19
 */
public class GeneralMethods {

    public static void main(String[] args) {

//        celsiusToKelvin(10D);
//        celsiusToKelvin(20D);
//        celsiusToKelvin(34D);

        double kilometers = metersToKilometers(400d);
        String message = distanceCompare(kilometers);
        System.out.println(message);

        double kilometers1 = metersToKilometers(600d);
        String message1 = distanceCompare(kilometers1);
        System.out.println(message1);

        double kilometers2 = metersToKilometers(800d);
        String message2 = distanceCompare(kilometers2);
        System.out.println(message2);

    }

    public static void celsiusToKelvin(double celsius) {
        double result = celsius + 273.16;
        System.out.println("Celsius to Kelvin: " + result);
    }

    public static double metersToKilometers(double meters) {
        double result = meters / 1000d;
        System.out.println("Meters to kilometers: " + result);
        return result;
    }

    public static String distanceCompare(double kilometers) {
        String message;

        if (kilometers > 0.7) {
            message = "Correct distance!";
        } else if (kilometers < 0.5) {
            message = "Excellent distance!";
        } else {
            message = "Bad distance!";
        }

        return message;
    }


}
