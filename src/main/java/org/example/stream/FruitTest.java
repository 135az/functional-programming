package org.example.stream;

import java.util.stream.Stream;

/**
 * @author yjz
 * @Date 2025/7/11 12:23
 */
public class FruitTest {

    public static void main(String[] args) {

        Stream.of(
                        new Fruit("草莓", "Strawberry", "浆果", "红色"),
                        new Fruit("桑葚", "Mulberry", "浆果", "紫色"),
                        new Fruit("杨梅", "Waxberry", "浆果", "红色"),
                        new Fruit("核桃", "Walnut", "坚果", "棕色"),
                        new Fruit("草莓", "Peanut", "坚果", "棕色"),
                        new Fruit("蓝莓", "Blueberry", "浆果", "蓝色")
                )
                .filter(fruit -> "浆果".equals(fruit.category))
                .filter(fruit -> "红色".equals(fruit.color))
                .forEach(System.out::println);

    }

    record Fruit(String cname, String name, String category, String color) {
    }

}
