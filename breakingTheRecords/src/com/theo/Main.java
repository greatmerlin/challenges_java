package com.theo;

import java.io.*;
import java.util.*;

public class Main {

    static int[] breakingRecords(int[] s)
    {
        int highest, lowest;
        highest = lowest = s[0];

        int[] result = new int[2];

        for (int s_i = 1; s_i < s.length; s_i++)
        {
            if (s[s_i] > highest)
            {
                highest = s[s_i];
                ++result[0];
            }
            else if (s[s_i] < lowest)
            {
                lowest = s[s_i];
                ++result[1];
            }
        }

        return result;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
