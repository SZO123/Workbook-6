package com.pluralsight.LambdaExercises;

interface Action1 {
    void run();
}

public class Exercise11 {
    public static void run() {
        perform(() -> System.out.println("Running from lambda!"));
    }

    public static void perform(Action action) {
        action.run();
    }
}