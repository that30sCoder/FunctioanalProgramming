package com.that30scoder;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {
    //Separate odd and even numbers in a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));


        //concise way
        collect.forEach((key,value)-> System.out.println((key ? "EVEN":"ODD") +"numbers" + value));


        //Remove duplicate elements from java list
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        System.out.println("List without duplicates" + listOfStrings.stream().distinct().toList());
        List<String> strings = listOfStrings.stream().distinct().collect(Collectors.toList());
        strings.add("abc");

        //Find frequency of eacg character java
        String charcters = "banana";
        Map<Character, Long> collect1 = charcters.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(chara -> chara, Collectors.counting()));
        System.out.println("Frequency of each character" + collect1);

        //frequency of each element
        int[] elements = {1, 2, 2, 3, 1};
        Map<Integer, Long> collect2 = Arrays.stream(elements).boxed().
                collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        collect2.forEach((key,value)-> System.out.println("Key" + key + "Vakue" + value));

        //Sort a given list of decimals in reverse order
        List<Double> decimals = new ArrayList<>(Arrays.asList(3.14, 1.59, 2.65, 4.23, 5.87));
        List<Double> collect3 = decimals.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reverse order of decimals" + collect3);

        //Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
        String collect4 = fruits.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println("Joined string" + collect4);


    }
}
