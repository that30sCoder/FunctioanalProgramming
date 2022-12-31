package com.that30scoder;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.that30scoder.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        List<Person> people = List.of(
                new Person("JOHN", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE)
        );

       Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        List<Person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());
                females2.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;


        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }


    }

    enum Gender {
        MALE, FEMALE
    }

}

