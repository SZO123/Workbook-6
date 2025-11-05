package com.pluralsight.LambdaExercises;

interface Calculator {
    int operate(int a, int b);
}

public class Exercise3 {
    public static void run() {
        Calculator subtract = (a, b) -> a - b;
        System.out.println("Subtraction result: " + subtract.operate(5, 3));
    }
}