package FFHS;

/**
 * @author Baxevanos Theologos
 * @version 1.0.0
 */

import java.util.Random;

public class CalculatePi {

    // Determine if dart thrown is inside the dart board
    public static boolean isInside(double xPos, double yPos) {
        double distance = Math.sqrt((xPos * xPos) + (yPos * yPos));

        return (distance < 1.0);
    }

    // Calculates PI based on the number of throws versus misses
    public static double computePI(int numThrows) {
        Random randomGen = new Random(System.currentTimeMillis());
        int hits = 0;
        double PI = 0;

        for (int i = 1; i <= numThrows; i++) {
            // Create a random coordinate result to test
            double xPos = (randomGen.nextDouble()) * 2 - 1.0;
            double yPos = (randomGen.nextDouble()) * 2 - 1.0;

            // Was the coordinate hitting the dart board?
            if (isInside(xPos, yPos)) {
                hits++;
            }
        }

        double dthrows = numThrows;

        // Use Monte Carlo method formula
        PI = (4.0 * (hits / dthrows));

        return PI;
    }
}
