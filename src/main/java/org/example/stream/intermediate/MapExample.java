package org.example.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yjz
 * @date 2025/7/14
 */
public class MapExample {

    /**
     * 对元素的操作主要通过 map(Function) 来完成，在上面的示例代码中也有看到过，常见于以下场景：
     * 1. 类型转换
     * 2. 数据转换
     * 3. 对象属性提取
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using map(Function) to square each number
        List<Integer> squaredNumbers = numbers.stream()
                .map(number -> number * number)
                .toList();

        System.out.println("Original list: " + numbers);
        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
