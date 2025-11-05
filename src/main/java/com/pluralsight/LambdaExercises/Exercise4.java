package com.pluralsight.LambdaExercises;

interface Multiplier {
    int multiply(int a, int b);
}

public class Exercise4 {
    public static void run() {
        Multiplier multiplier = (a, b) -> a * b;
        System.out.println("Multiplication result: " + multiplier.multiply(4, 6));
    }
}