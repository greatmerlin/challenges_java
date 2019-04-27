package com.theo;

/**
 * Use Inheritance by calling a Method from the Super Class Circle to the Child Class Cylinder.
 *
 * */

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3.75);

        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println(cylinder.getVolume());
    }
}
