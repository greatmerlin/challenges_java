package com.theo;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class SecondSafeArray implements Runnable {

    AtomicIntegerArray aia = new AtomicIntegerArray(10);

    @Override
    public void run() {

        //decrement by 1 from the current value at index 1
        aia.addAndGet(1,15);
        aia.decrementAndGet(1);

        //weakly compare the first args to current value and sets
        aia.compareAndSet(1,14,20);
        System.out.println(aia.get(1));
    }
}
