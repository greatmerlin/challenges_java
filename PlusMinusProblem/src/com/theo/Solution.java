package com.theo;

/**
 * Precision Problems
 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros.
 * Print the decimal value of each fraction on a new line.
 * for example given the array arr = [1,1, 0, -1 , -1]
 * output:
 * 2/5 -> 0.400000    -> positives  
 * 2/5 -> 0.400000   -> negatives
 * 1/5 -> 0.200000  -> ratio how many zeros are there to the array length
 *
 * */

import java.util.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int dimension = arr.length;
        double positives = 0;
        double negatives = 0;
        double zeros = 0;

        for (int i = 0; i < dimension; i++) {
            if (arr[i] > 0) {
                positives++;
            } else if (arr[i] < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }

        positives /= dimension;
        negatives /= dimension;
        zeros /= dimension;

        System.out.printf("%.6f\n%.6f\n%.6f\n", positives, negatives, zeros);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
