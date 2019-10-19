package com.theo;

/**
 *
 * grade range 0 to 100
 * any grade less than 40 is a failing grade
 * The professor rounds the grades according to the following rules:
 * if the difference between the grade and the next multiple of 5 is less than 3, round grade up to next multiple of 5
 * if the value of grade is less than 38, no rounding occurs and the grade remains failing
 * for example -> grade 84-> 85 , grade 29 -> remains 29.
 * Complete the function gradingStudents in the editor below. It should return an integer array consisting of rounded grades.
 * gradingStudents has the following parameter(s):
 * grades: an array of integers representing grades before rounding
 *
 *
 * */

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] grades = new int[size];

        for(int i=0; i < size; i++) {

            grades[i]=scanner.nextInt();
            grades[i] = (grades[i] >= 38) ?
                    ((grades[i] % 5 >= 3) ?
                            (grades[i] + (5 - (grades[i] % 5))) : grades[i]) : grades[i];
        }

        for(int i=0; i < size; i++) {

            System.out.println(grades[i]);
        }
    }
}
