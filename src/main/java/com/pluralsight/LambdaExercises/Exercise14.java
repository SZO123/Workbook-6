package com.pluralsight.LambdaExercises;

interface Operation {
    int apply(int a, int b);
}

public class Exercise14 {
    public static void run() {
        calculate((a, b) -> a + b);

        calculate((a, b) -> a - b);

        calculate((a, b) -> a * b);
    }

    public static void calculate(Operation op) {
        int result = op.apply(8, 2);
        System.out.println("Result: " + result);
    }
}