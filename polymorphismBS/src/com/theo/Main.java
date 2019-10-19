package com.theo;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Serie serie = randomSerie();
            System.out.println("Serie #" + i + " " + serie.getName() + "\n" + "Plot: " + serie.plot() + "\n");
        }


    }

    public static Serie randomSerie() {
        int randomNumber = (int)(Math.random() * 5 + 1);

        switch (randomNumber) {
            case 1:
                return new Dexter();
            case 2:
                return new Billions();
            case 3:
                return new BlackMirror();
            case 4:
                return new GameOfThrones();
            case 5:
                return new Sherlock();
        }
        return null;
    }
}
