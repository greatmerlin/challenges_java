package FFHS;

/**
 * @author Baxevanos Theologos
 * @version 1.0.0
 * Task: Find the Prime Numbers [2;100] using the Eratosthenes Sieve and write a proper JUnit Test.
 */

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {

    public List<Integer> primeNumbersUpTo(int maxNumber) {
        List<CandidateNumber> myNumbers = generateCandiNumbers(maxNumber);

        for (int i = 0; i < myNumbers.size(); i++) {
            CandidateNumber candidate = myNumbers.get(i);
            if (!candidate.isEliminated()) {
                int value = candidate.getNumber();
                for (int j = (value + value); j < myNumbers.size() + 2; j = (j + value)) {
                    myNumbers.get(j - 2).eliminateNumber();
                }
            }
        }

        List<Integer> myPrimes = new ArrayList<>();
        for (CandidateNumber number : myNumbers) {
            if (!number.isEliminated()) {
                myPrimes.add(number.getNumber());
            }
        }
        return myPrimes;
    }

    private List<CandidateNumber> generateCandiNumbers(int limit) {
        List<CandidateNumber> myNumbers = new ArrayList<>(limit);
        int counter = 2;
        while (counter <= limit) {
            myNumbers.add(new CandidateNumber(counter));
            counter++;
        }
        return myNumbers;
    }
}
