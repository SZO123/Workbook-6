package com.pluralsight.LambdaExercises;

interface NumberChecker {
    void check(int n);
}

public class Exercise10 {
    public static void run() {
        NumberChecker checker = n -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };

        for (int i = 1; i <= 5; i++) {
            checker.check(i);
        }
    }
}