package org.example.stream.intermediate;

import java.util.*;

/**
 * @author yjz
 * @date 2025/7/14
 */
public class OptionalExample {

    /**
     * Optional 主要用于在流中处理一些空元素，但是它还可以应用在代码的其他地方，它带来以下一些好处，例如：
     * <p>
     * 避免 NullPointerException：Optional 类帮助您更优雅地处理可能为 null 的值
     * 提高代码可读性：使用 Optional 类可以让您的代码更具表现力，更容易理解
     * 更好的 API 设计：使用 Optional 类可以让您的 API 更清晰地表达预期行为，例如，返回值可能为空的情况。
     * <p>
     * 在使用 Stream 时，很多操作都会返回 Optional 对象，例如：
     * <p>
     * findFirst(): 返回 Stream 中的第一个对象，使用 Optional 包装
     * findAny(): 返回 Stream 中任意一个对象，使用 Optional 包装
     * max(): 返回 Stream 中最大的对象，使用 Optional 包装
     * min(): 返回 Stream 中最小的对象，使用 Optional 包装
     * average(): 返回 Stream 中所有对象的平均值，使用 OptionalDouble 包装
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Optional<Integer> firstNumber = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        System.out.println("findFirst() example: " + firstNumber.orElse(-1));   // 输出：2

        Optional<Integer> anyNumber = numbers.stream().filter(n -> n > 2).findAny();
        System.out.println("findAny() example: " + anyNumber.orElse(-1));   // 输出：3

        Optional<Integer> maxNumber = numbers.stream().max(Comparator.naturalOrder());
        System.out.println("max() example: " + maxNumber.orElse(-1)); // 输出：9

        Optional<Integer> minNumber = numbers.stream().min(Comparator.naturalOrder());
        System.out.println("min() example: " + minNumber.orElse(-1)); // 输出：1

        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
        System.out.println("average() example: " + (average.isPresent() ? average.getAsDouble() : -1)); // 输出：5.0
    }
}
