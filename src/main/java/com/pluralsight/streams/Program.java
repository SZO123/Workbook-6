package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Kai", "Carter", 24));
        people.add(new Person("Nova", "Patel", 30));
        people.add(new Person("Leo", "Ramirez", 27));
        people.add(new Person("Zara", "Kim", 22));
        people.add(new Person("Miles", "Bennett", 34));
        people.add(new Person("Sienna", "Torres", 29));
        people.add(new Person("Arjun", "Singh", 31));
        people.add(new Person("Layla", "Brooks", 25));
        people.add(new Person("Ezra", "Nguyen", 28));
        people.add(new Person("Isla", "Parker", 26));

        System.out.print("Enter a name to search (first or last): ");
        String searchName = scanner.nextLine().trim().toLowerCase();

        List<Person> matches = new ArrayList<>();
        for (Person p : people) {
            if (p.getFirstName().toLowerCase().contains(searchName) ||
                    p.getLastName().toLowerCase().contains(searchName)) {
                matches.add(p);
            }
        }

        System.out.println("\nPeople matching '" + searchName + "':");
        if (matches.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            for (Person p : matches) {
                System.out.println(p.getFirstName() + " " + p.getLastName());
            }
        }

        int totalAge = 0;
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (Person p : people) {
            int age = p.getAge();
            totalAge += age;
            if (age > oldest) oldest = age;
            if (age < youngest) youngest = age;
        }

        double averageAge = (double) totalAge / people.size();

        System.out.println("\nAverage age: " + averageAge);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
    }
}
