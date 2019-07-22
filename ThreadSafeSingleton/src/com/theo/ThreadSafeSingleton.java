package com.theo;

/**
 * Thread Safe Singleton using Double Check Locking to prevent the performance reduction
 * */

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton tssInstance;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance(){

        if (tssInstance == null){
            synchronized (ThreadSafeSingleton.class){
                if (tssInstance == null){
                    tssInstance = new ThreadSafeSingleton();
                }
            }
        }
        return tssInstance;
    }
}
