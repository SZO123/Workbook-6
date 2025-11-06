package com.pluralsight.AppliedLambdaExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppDogs {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(
                new Dog("Spot", 6, "Labrador"),
                new Dog("Strawberry", 3, "Beagle"),
                new Dog("Maxey", 7, "Bulldog"),
                new Dog("Lucky", 2, "Labrador")
        );

        DogFilter olderThan5 = d -> d.getAge() > 5;
        DogFilter isLabrador = d -> d.getBreed().equals("Labrador");

        List<Dog> oldDogs = filterDogs(olderThan5, dogs);
        List<Dog> labradors = filterDogs(isLabrador, dogs);

        System.out.println("Dogs older than 5: " + oldDogs);
        System.out.println("Labradors: " + labradors);
    }

    public static List<Dog> filterDogs(DogFilter filter, List<Dog> dogs) {
        List<Dog> result = new ArrayList<>();
        for (Dog d : dogs) {
            if (filter.filter(d)) {
                result.add(d);
            }
        }
        return result;
    }
}