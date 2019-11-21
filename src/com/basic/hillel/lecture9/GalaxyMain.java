package com.basic.hillel.lecture9;

/**
 * Created by alpa on 11/14/19
 */
public class GalaxyMain {

    public static void main(String[] args) {
       Galaxy.Planet planet = new Galaxy.Planet("Earth");
        Galaxy galaxy = new Galaxy("Sun system");
        System.out.println(galaxy.getPlanetName());
    }
}
