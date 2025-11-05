package com.pluralsight.LambdaExercises;

interface Printer2 {
    void print(String text);
}

public class Exercise17 {
    public static void run() {
        Printer normalPrinter = text -> System.out.println(text);

        Printer upperPrinter = text -> System.out.println(text.toUpperCase());

        normalPrinter.print("Hello from normalPrinter");
        upperPrinter.print("Hello from upperPrinter");
    }
}