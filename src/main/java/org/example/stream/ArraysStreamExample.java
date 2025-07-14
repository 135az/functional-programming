package org.example.stream;

import java.util.Arrays;

/**
 * @author yjz
 * @date 2025/07/14
 */
public class ArraysStreamExample {

    public static void main(String[] args) {
        // IntStream
        int[] integer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(integer)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // Stream<String>
        String[] words = {"hello", "world", "java", "stream"};
        Arrays.stream(words)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // DoubleStream
        double[] doubles = {1.0, 3.5, 7.2, 8.8, 12.0, 15.5};
        double average = Arrays.stream(doubles)
                .average()
                .orElse(0.0);
        System.out.println("Average: " + average);
    }
}
