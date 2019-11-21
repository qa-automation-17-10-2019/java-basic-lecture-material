package com.basic.hillel.lecture10;

/**
 * Created by alpa on 11/21/19
 */
public class PetAnimal extends AbstractAnimal {

    @Override
    public void move() {
        System.out.println("Move slow");
    }

    @Override
    public void eat() {
        System.out.println("Eat a lot of food");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep all time");
    }

    public void voice() {
        System.out.println("GaB GaB");
    }
}
