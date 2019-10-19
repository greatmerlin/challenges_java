package com.theo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String word = in.next();
        long numberOfChars = in.nextLong();

        long count =0;

        for(char c : word.toCharArray()){
            if(c == 'a') {
                count++;
            }
        }

        long remain = (numberOfChars % word.length());

        for(int i=0; i < remain; i++) {
            if (word.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println(count);

    }
}