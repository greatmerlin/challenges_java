package com.theo;

/*
* An array is a type of data structure that stores elements of the same type in a contiguous block of memory.
* Here we have an array A of the size N.
* Print all N integers in A in reverse order as a single line of space-separated integers.
* */

import com.sun.deploy.util.ArrayUtil;

import java.io.*;
import java.util.*;


public class Main {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] data) {

        int left = 0;
        int right = data.length - 1;

        while( left < right ) {
            // swap the values at the left and right indices
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;

            // move the left and right index pointers in toward the center
            left++;
            right--;
        }
        return data;
    }

    public static void main(String[] args) throws IOException {

    int[] myArray = {3,4,33,1};

    reverseArray(myArray);

        System.out.println(Arrays.toString(myArray));

    }
}

