package com.theo;

/**
 *
 * Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer
 * on it. She decides to share a contiguous segment of the bar selected such that the length of the segment matches
 * Ron's birth month and the sum of the integers on the squares is equal to his birth day. You must determine how many
 * ways she can divide the chocolate
 *
 * chocolate: List s
 * d = day
 * m = month
 *
 *
 * */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Main {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        int sum = 0;
        int count = 0;
        int itr = 0;

        for(int i=0; i<s.size(); i++){
            for(int j=i; j<s.size(); j++){
                if (itr == m){
                    break;
                }
                sum = sum + s.get(j);
                itr++;
            }
            itr = 0;

            if(sum == d){
                count++;
            }
            sum = 0;
        }
        return count;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
