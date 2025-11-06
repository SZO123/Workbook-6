package com.pluralsight.AppliedLambdaExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "lambdas", "awesome", "fun");
        StringFilter longWordFilter = w -> w.length() > 5;
        List<String> longWords = filterWords(longWordFilter, words);
        System.out.println("Long words: " + longWords);
    }

    public static List<String> filterWords(StringFilter filter, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String w : words) {
            if (filter.filter(w)) {
                result.add(w);
            }
        }
        return result;
    }
}