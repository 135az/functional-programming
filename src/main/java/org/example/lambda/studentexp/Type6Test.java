package org.example.lambda.studentexp;

import java.util.stream.Stream;

public class Type6Test {

    /**
     * this::非静态方法名
     */
    public static void main(String[] args) {
        Util util = new Util();
        util.hiOrder(Stream.of(
                new Student("张无忌", "男"),
                new Student("周芷若", "女"),
                new Student("宋青书", "男")
        ));
    }

    record Student(String name, String sex) {

    }

    static class Util {
        boolean isMale(Student student) {
            return "男".equals(student.sex);
        }

        boolean isFemale(Student student) {
            return "女".equals(student.sex);
        }

        void hiOrder(Stream<Student> stream) {
            stream.filter(this::isMale)
                    .forEach(System.out::println);
        }
    }
}