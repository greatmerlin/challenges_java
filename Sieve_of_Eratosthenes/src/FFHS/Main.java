package FFHS;

/**
 * @author Baxevanos Theologos
 * @version 1.0.0
 * Task: Find the Prime Numbers [2;100] using the Eratosthenes Sieve and write a proper JUnit Test.
 */

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> myList = new SieveOfEratosthenes().primeNumbersUpTo(100);

        for (Integer myNumber : myList) {
            System.out.println(myNumber);
        }
    }
}
