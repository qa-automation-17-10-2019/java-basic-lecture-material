package com.basic.hillel.lecture10;

/**
 * Created by alpa on 11/21/19
 */
public class WildAnimal extends AbstractAnimal {

    @Override
    public void move() {
        System.out.println("Move fast if you are hungry!");
    }

    @Override
    public void eat() {
        System.out.println("Eat fresh meet!");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep hard!");
    }
}
