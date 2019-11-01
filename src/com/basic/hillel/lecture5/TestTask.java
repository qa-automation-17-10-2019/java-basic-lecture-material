package com.basic.hillel.lecture5;

/**
 * Created by alpa on 10/31/19
 */
public class TestTask {

    public static void main(String[] args) {

        int[] data = {13, 30, 40, 55};

        String result = unicodeArray(data);
        System.out.println(result);
    }

    public static String unicodeArray(int[] data) {

        String result = "";

        char temp;
        for (int i = 0; i < data.length; i++) {
            temp = (char) data[i];
            result += temp;
        }

        return result;
    }
}
