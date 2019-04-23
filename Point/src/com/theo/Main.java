package com.theo;

/**
 * Represent a point in 2D space.
 * two fields int x and y.
 * two constructors, one with parameters and one without.
 * write the getters, the setters and a method to calculate the distance between the two points.
 * use the Math.sqrt() Method and this formula
 * d(A,B)-> Math.sqrt(((xB - xA) * (xB - xA) + ((yB - yA) * (yB - yA)))
 *
 * */

public class Main {

    public static void main(String[] args) {

        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println(second.distance());
    }
}
