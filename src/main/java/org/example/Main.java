package org.example;

public class Main {
    public static void main(String[] args) {

        Compass compass = new Compass();
        System.out.println(compass.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT));
    }
}