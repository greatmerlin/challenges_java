package com.theo;

/**
 * The method call Proxy.newProxyInstance returns an Object created dynamically by Java during runtime time. There's no
 * compile time processing here.
 *
 * The returned Object implements all interfaces provided as second argument.
 *
 * Java uses Reflection to achieve that
 *
 * */

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
	MyHandler handler = new MyHandler();
	MyInterface myInterface = (MyInterface) Proxy.newProxyInstance(
	        MyHandler.class.getClassLoader(),
            new Class[]{MyInterface.class}, handler
    );
	myInterface.doSomething();
    }
}
