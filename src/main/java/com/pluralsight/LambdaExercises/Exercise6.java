package com.pluralsight.LambdaExercises;

import java.util.Random;

interface RandomPrinter {
    void printRandom();
}

public class Exercise6 {
    public static void run() {
        Random random = new Random();

        RandomPrinter printer = () -> System.out.println("Random number: " + (random.nextInt(10) + 1));

        printer.printRandom();
    }
}