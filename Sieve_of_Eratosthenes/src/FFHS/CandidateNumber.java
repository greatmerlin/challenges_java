package FFHS;

/**
 * @author Baxevanos Theologos
 * @version 1.0.0
 * Task: Find the Prime Numbers [2;100] using the Eratosthenes Sieve and write a proper JUnit Test.
 */

public class CandidateNumber {

    private final int number;
    private boolean eliminated;

    public CandidateNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isEliminated() {
        return eliminated;
    }

    public void eliminateNumber() {
        eliminated = true;
    }
}
