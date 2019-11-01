package com.basic.hillel.lecture5;

/**
 * Created by alpa on 10/31/19
 */
public class JavaMethods {

    public static void main(String[] args) {

        celsiusToKelvin(10D);
        celsiusToKelvin(20);
        celsiusToKelvin();
        celsiusToKelvin(15d, 23d);
        celsiusToKelvin("sdg");

    }

    public static void celsiusToKelvin(double celsius) {
        double result = celsius + 273.16;
        System.out.println("Celsius to Kelvin: " + result);
    }

    public static void celsiusToKelvin(double celsius, double kelvin) {
        double result = celsius + kelvin;
        System.out.println("Celsius to Kelvin: " + result);
    }

    public static void celsiusToKelvin(int celsius) {
        double result = celsius + 273.16;
        System.out.println("Celsius to Kelvin: " + result);
    }

    public static void celsiusToKelvin(String message) {
        double result = 23 + 273.16;
        System.out.println(message);
    }


    public static void celsiusToKelvin() {
        double result = 25 + 273.16;
        System.out.println("Celsius to Kelvin: " + result);
    }

}
