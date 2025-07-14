package org.example.stream.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yjz
 * @date 2025/7/14
 */
public class FlatMapExample {

    /**
     * flatMap()：与 map() 所作的事情相同，但它将这些生成的 Stream 合并为一个单一的 Stream
     * flatMap() 在函数式编程和流式处理中非常有用，因为它可以解决一些常见的数据处理问题。
     * <p>
     * 1.展平嵌套数据结构：在处理复杂的数据结构时，我们经常会遇到嵌套的集合，例如列表的列表、集合的集合等。
     * flatMap() 可以将这些嵌套的数据结构展平为一个单一的流，从而简化后续的数据处理和操作。
     * 2.合并多个流：在某些情况下，我们需要将多个流合并成一个流，以便对所有流中的数据执行相同的操作。
     * flatMap() 可以帮助我们将这些流合并为一个流，从而提高代码的可读性和可维护性。
     * 3.动态生成流：flatMap() 使我们能够根据流中的每个元素动态生成新的流，并将这些新生成的流合并为一个流。
     * 这对于根据流中的数据动态创建数据处理管道非常有用。
     * 4.更高效的操作链：在某些情况下，使用 flatMap() 可以减少对流中数据的遍历次数，从而提高操作链的效率。
     * 例如，如果我们需要先对流中的每个元素执行映射操作，然后再执行筛选操作，
     * 我们可以使用 flatMap() 将这两个操作组合在一起，从而减少对流的遍历次数。
     */
    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flatList = nestedList.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println("Nested list: " + nestedList);
        System.out.println("Flat list: " + flatList);
    }
}
