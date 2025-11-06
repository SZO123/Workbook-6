package com.pluralsight.AppliedLambdaExercises;

import java.util.Arrays;
import java.util.List;

public class AppDogActions {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(
                new Dog("Pup", 6, "Labrador"),
                new Dog("Rui", 3, "Beagle")
        );

        DogAction praise = d -> System.out.println("Good dog, " + d.getName() + "!");
        DogAction showAge = d -> System.out.println(d.getName() + " is " + d.getAge() + " years old");

        forEachDog(praise, dogs);
        forEachDog(showAge, dogs);
    }

    public static void forEachDog(DogAction action, List<Dog> dogs) {
        for (Dog d : dogs) {
            action.act(d);
        }
    }
}