package com.theo;

/**
 * An example of object oriented programming.
 * make an application that calculates the cost of a carpet on an area.
 *
 * */

public class Main {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4);

        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("total = " + calculator.getTotalCost());
    }
}
