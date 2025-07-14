package org.example.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author yjz
 * @date 2025/7/14
 */
public class CollectExample {

    /**
     * collect(Collector)：使用 Collector 收集流元素到结果集合中
     *
     * @param args
     */
    public static void main(String[] args) {
        // 收集到 List
        List<String> collectedList = Stream.of("apple", "banana", "orange", "grape")
                .map(String::toUpperCase)
                .toList();
        System.out.println("Collected List: " + collectedList);

        // 收集到 Set
        Set<String> collectedSet = Stream.of("apple", "banana", "orange", "grape")
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
        System.out.println("Collected Set: " + collectedSet);

        // 收集到 Map
        Map<String, Integer> map = Stream.of("apple", "banana", "orange", "grape")
                .map(String::toUpperCase)
                .collect(Collectors.toMap(s -> s, String::length));
        System.out.println("Collected Map: " + map);

        // 收集到 String，使用逗号分隔
        String joinedString = Stream.of("apple", "banana", "orange", "grape")
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println("Joined String: " + joinedString);
    }
}
