package com.theo;

import java.util.Scanner;

/**
 *
 * hour glass sum
 *
 * */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int matrix[][] = new int[6][6];

        //Read in:
        for (int i = 0; i < 6; i++) {
            
            for (int j = 0; j < 6; j++) {

                matrix[i][j] = in.nextInt();
            }
        }

        int maxSum = -64; //Because the minimum it could be is -9*7 = -63
        int startCol = 0;

        //Each iteration of the outer loop is one hour glass:
        for (int row = 0; row <= 3; row++) {

            int sum = 0; //Initialize this specific hourglass' sum
            for (int col = startCol; col < startCol + 3; col ++) {

                sum += matrix[row][col]; //Gets current index that col and row are on

                if (col == startCol) { //Only doing it if it's on the startCol ensures we only add middle piece once

                    sum += matrix[row+1][startCol+1];
                }
                sum += matrix[row+2][col]; //Gets the corresponding index in the bottom row
            }
            startCol = (startCol < 3) ? startCol + 1 : 0; // If there is space for another hourglass in this row, goto the next Col

            if (startCol != 0) { //If there is space for another hourglass in this row, continue in the same row

                row--;             //You need to decrement in order to do this bc for loop will increment
            }
            if (sum > maxSum) {

                maxSum = sum;
            } //keeps track of what the maximum sum is so we can print it at the end
        }

        System.out.println(maxSum);

    }
}
