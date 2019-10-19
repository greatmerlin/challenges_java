package com.theo;

public class Main {

    public static void main(String[] args) {
        //
        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {

                if (i == 1 || j == 1 || i == 4 || j == 4) {         //if row is 1st or 4th and column is 1st or 4th print ($ and space)

                    System.out.print("$ ");
                }
                else {                                           //if column is 2nd or 3rd and row is 2nd or 3rd print( two spaces)

                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 6; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 6; i++) {

            for (int j = 6; j >= i; j--) {

                System.out.print(j + " ");
            }

            System.out.println();
        }



    }
}

