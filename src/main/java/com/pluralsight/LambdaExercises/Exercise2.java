package com.pluralsight.LambdaExercises;

interface Greeter2 {
    void greet(String name);
}

public class Exercise2 {
    public static void run() {
        Greeter greeter = name -> System.out.println("Hi " + name + "! Have a great day!");
        greeter.greet("Najib");
    }
}