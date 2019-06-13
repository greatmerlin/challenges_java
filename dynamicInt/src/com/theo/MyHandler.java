package com.theo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method);
        System.out.println();
        Arrays.stream(Thread.currentThread()
                .getStackTrace())
                .forEach(System.out::println);
        return null;
    }
}
