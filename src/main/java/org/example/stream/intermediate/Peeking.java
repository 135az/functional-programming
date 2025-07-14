package org.example.stream.intermediate;

import java.util.Arrays;
import java.util.List;

/**
 * @author yjz
 */
public class Peeking {

    /**
     * Stream.peek() 是一个中间操作，它接受一个 Consumer，
     * 并允许您在流的每个元素上执行某个操作，同时保持流的元素不变。
     * 通常用于调试目的，因为它允许您查看流处理过程中的中间结果。
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Cindy", "David");

        List<String> result = names.stream()
                .filter(name -> name.length() > 3)
                .peek(name -> System.out.println("Filtered name: " + name))
                .map(String::toUpperCase)
                .peek(name -> System.out.println("Mapped name: " + name))
                .toList();

        System.out.println("Result: " + result);
    }
}
