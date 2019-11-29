package com.basic.hillel.lecture12;

/**
 * Created by alpa on 11/28/19
 */
public class User {

    private String name;
    private Cat cat;
    private Dog dog;

    public User(String name) {
        this.name = name;
        cat = new Cat();
        cat.setName("Barsik");
    }

    public User(String name, String catName, String dogName) {
        this.name = name;
        cat = new Cat();
        cat.setName(catName);
        dog = new Dog();
        dog.setName(dogName);
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public class Cat {

        private String name;

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public void sayMeu() {
            System.out.println("Meu Meu " + User.this.name);
        }
    }

    static class Dog {

        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public void sayWuf() {
            System.out.println("Wuf wuf said " + name);
        }
    }
}
