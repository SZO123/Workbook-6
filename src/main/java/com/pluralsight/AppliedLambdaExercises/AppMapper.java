package com.pluralsight.AppliedLambdaExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppMapper {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");
        StringMapper toUpper = s -> s.toUpperCase();

        List<String> mapped = mapStrings(toUpper, words);
        System.out.println("Uppercase words: " + mapped);
    }

    public static List<String> mapStrings(StringMapper mapper, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String w : words) {
            result.add(mapper.map(w));
        }
        return result;
    }
}