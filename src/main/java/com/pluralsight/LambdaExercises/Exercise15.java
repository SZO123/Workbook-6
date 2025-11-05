package com.pluralsight.LambdaExercises;

interface NamePrinter {
    void print(String name);
}

public class Exercise15 {
    public static void run() {
        String[] names = {"Najib", "Mike", "Tim"};

        NamePrinter printer = name -> System.out.println("Name: " + name);

        for (String name : names) {
            printer.print(name);
        }
    }
}