package com.pluralsight.LambdaExercises;

interface Hello {
    void sayHello();
}

public class Exercise1 {
    public static void run() {
        Hello hello = () -> System.out.println("Hi from Java!");
        hello.sayHello();
    }
}