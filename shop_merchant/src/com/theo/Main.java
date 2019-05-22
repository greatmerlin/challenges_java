package com.theo;

/**
 *
 * first give the number of the socks there are (ie 9).
 * then, give the sock numbers (ie 36 36 37 38 38 42 38 37 42).
 *
 * the program should calculate the number of pairs you have. Number separator should be the space.
 * (ie 2x36, 2x38, 2x42, 2x37 -> 4 pairs).
 *
 * */

import java.io.IOException;
import java.util.*;

public class Main {

    static int sockMerchant(int n, int[] ar) {

        Arrays.sort(ar);

        int count=0;

        for(int i=0; i < n-1; i++){

            if(ar[i] == ar[i+1]){

                count+=1;
                i+=1;
             }
        }
     return count;
    }

/*        Set<Integer> colors = new HashSet<>();

        int pairs = 0;

        for (int i = 0; i < n; i++) {

            if (!colors.contains(ar[i])) {

                colors.add(ar[i]);
            }
            else {

                pairs++;
                colors.remove(ar[i]);
            }
        }

        return pairs;
    }*/



    private static final Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) throws IOException {

                int n = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                int[] ar = new int[n];

                String[] arItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int i = 0; i < n; i++) {

                    int arItem = Integer.parseInt(arItems[i]);
                    ar[i] = arItem;
                }

                int result = sockMerchant(n, ar);

                System.out.println(result);
            }
 }

