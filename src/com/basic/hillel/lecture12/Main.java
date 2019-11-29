package com.basic.hillel.lecture12;

/**
 * Created by alpa on 11/28/19
 */
public class Main {

    public static void main(String[] args) {
        User user = new User("Bob", "Barsik", "Tuzik");
//        User.Cat cat = new User.Cat();
        User.Cat cat = user.getCat();
        cat.sayMeu();

//        User.Dog dog = new User.Dog();
        User.Dog dog = user.getDog();
        dog.sayWuf();

    }
}
