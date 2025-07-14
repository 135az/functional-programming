package org.example.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author yjz
 */
public class FindExample {

    /**
     * findFirst()：查找第一个满足某个条件的元素，这在有序流中非常有用
     * findAny()：在流中查找任意一个满足某个条件的元素，这在并行流中非常有用
     *
     * @param args
     */
    public static void main(String[] args) {
        // findFirst 示例
        Optional<Integer> first =
                Stream.of(1, 2, 3, 4, 5)
                        .filter(num -> num % 2 == 0)
                        .findFirst();
        first.ifPresent(System.out::println); // 输出：2

        // findAny 示例
        Optional<Integer> any =
                Stream.of(1, 2, 3, 4, 5, 6)
                        .filter(num -> num % 2 == 0)
                        .findAny();
        any.ifPresent(System.out::println); // 输出：2 或者 4 或者 6
    }
}
