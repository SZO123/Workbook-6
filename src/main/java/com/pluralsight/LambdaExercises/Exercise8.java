package com.pluralsight.LambdaExercises;

interface Greeter {
    void greet(String name);
}

public class Exercise8 {
    public static void run() {
        // Lambda expression
        Greeter greeter = name -> System.out.println("Hello, " + name + "!");

        // Reuse lambda with different names
        greeter.greet("Najib");
        greeter.greet("Jay");
        greeter.greet("Vic");
    }
}