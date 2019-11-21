package com.basic.hillel.lecture9;

/**
 * Created by alpa on 11/14/19
 */
public class Galaxy {

    private String name;
    private Planet planet = new Planet("Earth");

    public Galaxy() {}

    public Galaxy(String name) {
        this.name = name;
        this.planet = planet;
    }

    public String getName() {
        return name;
    }

    public String getPlanetName() {
        return planet.getName();
    }

    public static class Planet {

        private String name;

        public Planet(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
