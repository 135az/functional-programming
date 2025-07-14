package org.example.stream;

import java.util.stream.Stream;

/**
 * @author yjz
 */
public class MatchExample {

    public static void main(String[] args) {
        // allMatch：检查流中的所有元素是否都满足某个条件
        boolean allEven = Stream.of(1, 2, 3, 4, 5).allMatch(num -> num % 2 == 0);
        System.out.println(allEven); // 输出：false

        // anyMatch：检查流中是否存在满足某个条件的元素
        boolean anyEven = Stream.of(1, 2, 3, 4, 5).anyMatch(num -> num % 2 == 0);
        System.out.println(anyEven); // 输出：true

        // noneMatch：检查流中是否不存在满足某个条件的元素
        boolean noneMatch = Stream.of(1, 2, 3, 4, 5).noneMatch(num -> num > 10);
        System.out.println(noneMatch);  // 输出：true
    }
}
