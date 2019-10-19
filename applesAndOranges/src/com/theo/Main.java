package com.theo;

/**
 *
 * Sam's house has an apple tree and an orange tree that yield an abundance of fruit. In the diagram below, the
 * red region denotes his house, where s is the start point, and t is the endpoint. The apple tree is to the left of his
 * house, and the orange tree is to its right. You can assume the trees are located on a single point, where the
 * apple tree is at point a, and the orange tree is at point b.
 *When a fruit falls from its tree, it lands units of distance d from its tree of origin along the x-axis.
 *
 *
 * */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();

        /* Calculate # of apples that fall on house */
        int applesOnHouse = 0;

        for (int i = 0; i < m; i++) {
            int applePosition = a + scan.nextInt();
            if (applePosition >= s && applePosition <= t) {
                applesOnHouse++;
            }
        }
        System.out.println(applesOnHouse);

        /* Calculate # of oranges that fall on house */
        int orangesOnHouse = 0;

        for (int i = 0; i < n; i++) {
            int orangePosition = b + scan.nextInt();
            if (orangePosition >= s && orangePosition <= t) {
                orangesOnHouse++;
            }
        }
        System.out.println(orangesOnHouse);

        scan.close();
    }
}

