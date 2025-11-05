package com.pluralsight.LambdaExercises;

interface Divider {
    double divide(double a, double b);
}

public class Exercise7 {
    public static void run() {

        Divider dividerExplicit = (double a, double b) -> a / b;
        System.out.println("Explicit types: 10 / 2 = " + dividerExplicit.divide(10, 2));


        Divider dividerInferred = (a, b) -> a / b;
        System.out.println("Inferred types: 9 / 3 = " + dividerInferred.divide(9, 3));
    }
}