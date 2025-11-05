package com.pluralsight.LambdaExercises;

interface Printer {
    void print(String text);
}

public class Exercise9 {
    public static void run() {
        String prefix = "Message: ";

        Printer printer = text -> System.out.println(prefix + text);

        printer.print("Hello World!");
        printer.print("Lambda is cool!");

    }
}