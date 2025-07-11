package org.example.lambda.studentexp;

import java.util.stream.Stream;

public class Type4Test {
    /**
     * 对象::非静态方法名
     */
    public static void main(String[] args) {
        Util util = new Util();
        Stream.of(
                        new Student("张无忌", "男"),
                        new Student("周芷若", "女"),
                        new Student("宋青书", "男")
                )
                .filter(util::isMale)
                .map(util::getName)
                .forEach(System.out::println);
    }

    record Student(String name, String sex) {
    }

    static class Util {
        boolean isMale(Student student) {
            return "男".equals(student.sex);
        }

        String getName(Student student) {
            return student.name();
        }
    }
}