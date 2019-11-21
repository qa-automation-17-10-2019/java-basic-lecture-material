package com.basic.hillel.lecture10;

/**
 * Created by alpa on 11/21/19
 */
public abstract class AbstractAnimal {

    public abstract void move();

    public abstract void eat();

    public abstract void sleep();

    public void live() {
        System.out.println("I am Happy animal!");
    }


}
