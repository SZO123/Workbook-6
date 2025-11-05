package com.pluralsight.LambdaExercises;

interface MessageHandler {
    void handle(String message);
}

public class Exercise13 {
    public static void run() {
        sendMessage(msg -> System.out.println(msg.toUpperCase()));
    }

    public static void sendMessage(MessageHandler handler) {
        handler.handle("Hello from method!");
    }
}