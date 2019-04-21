package com.theo;

import java.util.Scanner;

public class Main {

    /**
     * A challenge to create a Program that waits for users input. It accepts only int and if a String is
     * inserted, the program stops and it prints out the sum of the numbers and the average of them.
     *
     * */

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in); // starts the stdin

        System.out.println("Please enter some numbers. To exit the program, write a letter.");

        int sum = 0;
        int count = 0;

        while (true) {

            if (scanner.hasNextInt()) {  // if the user inserts an int number run the following program:

                sum += scanner.nextInt(); // add this number to the "sum"
                count++;  // add the count number by 1
            }
            else{
                break; // if the user inserts something else, exit the program
            }
        }

        // double avg = count == 0 ? 0 : ((double) sum /count);  // calculate after exiting the loop (program)

        double avg = (double) sum / count; // calculate after exiting the loop (program)
        System.out.println("Sum = " + sum + "\nAvg = " + Math.round(avg)); // print after exiting the loop(program)
    }
}




