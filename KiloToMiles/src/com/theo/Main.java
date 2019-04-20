package com.theo;

/**
 * A simple challenge to turn kilometer to Miles, in a rounded up form by calling the Math.round() Method.
 * Hint: 1 Mile = 1.609 Kilometers
 * The second Method "printConversion" calls the "toMilesPerHour" Method in order to work.
 * */

public class Main {

    public static void main(String[] args) {

        System.out.println(toMilesPerHour(100));

        printConversion(100);

    }



    public static long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }


    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {

            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
