package org.example.stream;

import java.util.stream.Stream;

public class Fibonacci {
    int x = 1;

    /**
     * Stream.iterate 是 Java 8 引入的 Stream API 的一部分，
     * 它接受一个种子值（seed）和一个一元函数（unary operator），
     * 然后生成一个无限的、顺序的流。流中的每个元素都是通过对前一个元素应用一元函数生成的。
     * 与 Stream.generate 类似， Stream.iterate 常常用于生成一个斐波那契数列，
     */
    Stream<Integer> numbers() {
        return Stream.iterate(0, i -> {
            int result = x + i;
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {
        Fibonacci fbi = new Fibonacci();
        fbi.numbers()
                .skip(20)           // 丢弃前 20 个
                .limit(10)     // 取 10 个
                .forEach(System.out::println);
    }
}
