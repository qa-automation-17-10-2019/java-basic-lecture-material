package com.basic.hillel.lecture10;

/**
 * Created by alpa on 11/21/19
 */
public class AbstractMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
        dog.eat();
        dog.sleep();
        dog.live();
        dog.voice();

        Wolf wolf = new Wolf();
        wolf.move();
        wolf.eat();
        wolf.sleep();
        wolf.live();

    }


}
