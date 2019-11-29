package com.basic.hillel.lecture12;

/**
 * Created by alpa on 11/28/19
 */
public class MainEnum {

    public static void main(String[] args) {

        System.out.println(Phones.IPHONE.name());
        System.out.println(Phones.IPHONE.getModel());
        System.out.println(Phones.SAMSUNG);
        System.out.println(Phones.SAMSUNG.getModel());
        System.out.println(Phones.OPPO.getProducer());
        System.out.println(Phones.XIAOMI.getProducer());

        sayHello(Phones.XIAOMI);

        Phones[] phones = Phones.values();
        for (Phones phone: phones) {
            System.out.println(phone.getModel() + " " + phone.getProducer());
        }

        Phones phones1 = Phones.valueOf("OPPO");
        System.out.println(phones1.getModel());

        boolean equals = Phones.IPHONE.equals(Phones.IPHONE);
        System.out.println(equals);

        Producer producer1 = Phones.IPHONE.getProducer1();
        System.out.println(producer1.name());
    }

    public static void sayHello(Phones phones) {
        switch (phones) {
            case IPHONE:
                System.out.println("Say hello " + Phones.IPHONE.getModel());
                break;
            case SAMSUNG:
                System.out.println("Say hello " + Phones.SAMSUNG.getModel());
                break;
        }

    }
}
