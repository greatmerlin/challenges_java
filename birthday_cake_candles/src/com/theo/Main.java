package com.theo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year
 * of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to
 * find out how many candles she can successfully blow out.
 *
 * For example, if your niece is turning 4 years old, and the cake will have 4 candles of height 4,4,1,3 she will be
 * able to blow out 2 candles successfully, since the tallest candles are of height 4 and there are 2 such candles.
 *
 * Complete the function birthdayCakeCandles in the editor below. It must return an integer representing the number
 * of candles she can blow out.
 *
 * */


public class Main {

    static int birthdayCakeCandles(int[] ar) {

        Arrays.sort(ar);  // sort the array into ascending numerical order.

        int result = 1;
        int decriment = 2;

        while((decriment <= ar.length) && (ar[ar.length-1] == ar[ar.length-decriment])) {

            result++;
            decriment++;
        }

        return result;
    }

    /*
    * The thought behind this algorithm is, we sort a list px array(3): 4, 14 , 14
    * Then we set the result to 1, because even with 1 candle, it is the tallest, so we have a result
    * Then we check if there are 2 candles in our array (left side of the while statement) 2 <= array.length,
    * if it is 1 returns immediately 1.
    * Then we first check the 2 last elements of the array -> ar[2] == ar[1], if they are returns is been
    * incremented by one and then we check again withe the other elements one by one.
    * with decrement = 3 -> ar[2] == ar[3-3=0] -> 14 ! 4 -> exit loop and take the result!
    * */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        System.out.println(result);

        scanner.close();

    }
}
