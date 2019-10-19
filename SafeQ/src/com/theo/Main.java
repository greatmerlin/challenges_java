package com.theo;

/**
 *  AtomicIntegerArray is a thread safe array of integer. An example with the following code.
 *  Queue Code that we wrote for the Task 3 is already thread safe.
 * */

public class Main {

    public static void main(String[] args) {

        new Thread(new SafeArray()).start();
        new Thread(new SecondSafeArray()).start();
    }
}
