package org.example.lambda.studentexp;

import java.util.stream.Stream;

public class Type2Test {
    /**
     * 类名::静态方法名
     * filter 这个高阶函数接收的函数类型（Predicate）是：一个 T 类型的入参，一个 boolean 的返回值
     * 因此我们只需要给它提供一个相符合的 lambda 对象即可
     * isMale 这个静态方法有入参 Student 对应 T，有返回值 boolean 也能对应上，所以可以直接使用
     */
    public static void main(String[] args) {
        /*
            需求：挑选出所有男性学生
         */
        Stream.of(
                        new Student("张无忌", "男"),
                        new Student("周芷若", "女"),
                        new Student("宋青书", "男")
                )
                .filter(Type2Test::isMale)
                .forEach(System.out::println);
    }

    static boolean isMale(Student student) {
        return "男".equals(student.sex);
    }

    record Student(String name, String sex) {
    }
}