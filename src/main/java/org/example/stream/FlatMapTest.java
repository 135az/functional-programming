package org.example.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author yjz
 * @Date 2025/7/11 13:45
 */
public class FlatMapTest {

    public static void main(String[] args) {
        Stream.of(
                        List.of(
                                new Fruit("草莓", "Strawberry", "浆果", "红色"),
                                new Fruit("桑葚", "Mulberry", "浆果", "紫色"),
                                new Fruit("杨梅", "Waxberry", "浆果", "红色"),
                                new Fruit("蓝莓", "Blueberry", "浆果", "蓝色")
                        ),
                        List.of(
                                new Fruit("核桃", "Walnut", "坚果", "棕色"),
                                new Fruit("草莓", "Peanut", "坚果", "棕色")
                        )
                )
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        Integer[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        Arrays.stream(array2D)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);
    }

    record Fruit(String cname, String name, String category, String color) {
    }
}
