package com.pluralsight.LambdaExercises;

interface MathAction {
    int act(int a, int b);
}

public class Exercise16 {
    public static void run() {
        MathAction adder = getAdder();

        int result = adder.act(3, 7);
        System.out.println("Addition result: " + result);
    }

    public static MathAction getAdder() {
        return (a, b) -> a + b;
    }
}