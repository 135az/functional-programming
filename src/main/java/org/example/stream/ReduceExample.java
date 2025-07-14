package org.example.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author yjz
 */
public class ReduceExample {

    /**
     * reduce() 方法用于将流中的元素进行累积操作，返回一个 Optional 对象。
     * 如果流为空，则返回一个空的 Optional 对象。
     * 如果流不为空，则返回一个包含累积结果的 Optional 对象。
     *
     * @param args
     */
    public static void main(String[] args) {
        // 求和
        OptionalInt sum = IntStream.range(0, 100).reduce(Integer::sum);
        sum.ifPresent(System.out::println);

        // 求积
        OptionalInt numbers = IntStream.range(0, 100).reduce((a, b) -> a * b);
        numbers.ifPresent(System.out::println);

        // 求最大值
        OptionalInt max = IntStream.range(0, 100).reduce(Integer::max);
        max.ifPresent(System.out::println);

        // 求最小值
        OptionalInt min = IntStream.range(0, 100).reduce(Integer::min);
        min.ifPresent(System.out::println);

        // 使用给定的初始值（identity）和累积器函数，对流中的元素进行累积操作，这里返回 int 值
        int reduced = IntStream.range(0, 100).reduce(10, Integer::sum);
        System.out.println(reduced);
    }
}
