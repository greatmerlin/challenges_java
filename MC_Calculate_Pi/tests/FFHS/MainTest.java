package FFHS;

/**
 * @author Baxevanos Theologos
 * @version 1.0.0
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void mainTest() {

            int numThrows = 10000000;
            double PI = CalculatePi.computePI(numThrows);
            System.out.println("The actual value: " + PI) ;

            double actual = PI;

            double expected = Math.PI;
            System.out.println("The expected Pi value: " + Math.PI);

            double difference = Math.abs(expected - actual);
            System.out.println("The difference between them is: " + difference);

            double toleratedValue = Math.PI * 5.00/100;

            assertEquals(expected,actual,toleratedValue);
        }
}