package com.theo;

/**
 * Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are
 * thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number
 * of the current cloud plus 1 or 2. She must avoid the thunderheads. Determine the minimum number of jumps it will take
 * Emma to jump from her starting postion to the last cloud. It is always possible to win the game.
 *
 * */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int c[] = new int[n];

        for(int i=0; i < n; i++){
            c[i] = in.nextInt();
        }

        int count = -1;

        for (int i = 0; i < n; i++, count++) {
            if (i<n-2 && c[i+2]==0) i++;
        }

        System.out.println(count);
    }
}

/*
*
* the loop means: keeps jumping from the i-th cloud between 0 and n-1, to (1) if there are two spaces left at least
* and if the two cloud down happens to be an ordinary cloud, jumps two space (2) if not, just jump one space
*
*
* */
