package com.pluralsight.LambdaExercises;

interface Action {
    void run();
}

public class Exercise12 {
    public static void run() {
        perform(() -> System.out.println("Start!"));
        perform(() -> System.out.println("Still running"));
        perform(() -> System.out.println("Done!"));
    }

    public static void perform(Action action) {
        action.run();
    }
}