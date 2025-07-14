package org.example.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yjz
 * @date 2025/7/14
 */
public class DistinctAndFilterExample {

    /**
     * distinct()：消除流中重复的元素，相比创建 Set 成本低的多
     * filter(Predicate)：根据 Predicate 逻辑进行过滤，剩下的元素传递给后面的流
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 1, 4, 5, 4, 6, 7, 7, 8);
        List<Integer> result = numbers.stream()
                .distinct()     // 1: 消除重复元素
                .filter(e -> e % 2 == 0)        // 2: 筛选出偶数
                .collect(Collectors.toList());      // 3: 将结果放入 List 中

        System.out.println(result);
    }
}
