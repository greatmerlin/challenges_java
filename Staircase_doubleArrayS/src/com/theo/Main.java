package com.theo;

/**
 *
 * Consider a staircase of size n = 4
 * It's base and it's height aare both equal to n and the images are drawn by using # symbols and spaces.
 * The last line is not preceded by any spaces.
 * Write a program that prints a staircase of size n.
 *
 * */

import java.util.*;


public class Main {

    // also solved with a double array

    static void staircase(int n) {

        for(int i=0 ; i < n ; i++) {

            for(int j = 0; j <= n-i-2; j++) {

                System.out.print(" ");
            }
                for(int j = n-i-1 ; j< n; j++) {

                    System.out.print("#");
                }

         System.out.println();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
