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

    static void staircase(int n) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n ; i++) {
            builder.append(" ");
        }

        int j = 0;

        for (int i = 1; i <= n; i++) {
            builder.replace(    builder.length() - i,
                                builder.length() - j,
                                "#");
            System.out.println(builder);
            j++;
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
