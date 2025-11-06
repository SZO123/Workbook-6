package com.pluralsight.AppliedLambdaExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        IntFilter evenFilter = n -> n % 2 == 0;
        List<Integer> evenNumbers = filterNumbers(evenFilter, numbers);
        System.out.println("Even numbers: " + evenNumbers);
    }

    public static List<Integer> filterNumbers(IntFilter filter, List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int n : numbers) {
            if (filter.filter(n)) {
                result.add(n);
            }
        }
        return result;
    }
}