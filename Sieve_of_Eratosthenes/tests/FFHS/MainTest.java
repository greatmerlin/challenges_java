package FFHS;

/**
 * @author Baxevanos Theologos
 * @version 1.0.0
 * Task: Find the Prime Numbers [2;100] using the Eratosthenes Sieve and write a proper JUnit Test.
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class MainTest {

    @Test
    public void generateAndCheckTheFirst10PrimeNumbers() {

        List<Integer> actual = new SieveOfEratosthenes().primeNumbersUpTo(30);

        // uncomment below to check what are the numbers of the actual list:

        /* for (Integer integer : actual) {
              System.out.println(integer);
        }*/

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);
        expected.add(17);
        expected.add(19);
        expected.add(23);
        expected.add(29);

        assertThat(actual, is(expected));


    }
}