package com.theo;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class SafeArray extends Thread {

    AtomicIntegerArray aia = new AtomicIntegerArray(10);

    @Override
    public void run() {
        //add the value 2 at index 1
        aia.addAndGet(1,15);

        aia.compareAndSet(1,15,5);

        System.out.println(aia.get(1));
    }
}
