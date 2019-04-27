package com.theo;

/**
 * Create a class "wall".
 * The class should have two fields (instance variables) with the name width and height of type double.
 * The class should have TWO constructors, the first one does not have any parameters (no-arg contructor)
 * and the second one should initialize both fields (width and height as parameters). If width is less than
 * 0, it should take the value 0, same for height.
 * create some getters and setters and a method that calculates the area of the wall.
 *
 * */

public class Main {

    public static void main(String[] args) {

        Wall wall = new Wall(5,4);
        System.out.println("area: " + wall.getArea());
    }
}
