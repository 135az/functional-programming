package org.example.lambda.studentexp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yjz
 * @Date 2025/7/11 11:25
 */
public class Main {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("张无忌", 18, "男"),
                new Student("杨不悔", 16, "女"),
                new Student("周芷若", 19, "女"),
                new Student("宋青书", 20, "男")
        );
        // 能得到 张无忌，宋青书
        System.out.println(filter1(students));
        System.out.println(filter(students, student -> "男".equals(student.getSex())));

        // 能得到 张无忌，杨不悔
        System.out.println(filter2(students));
        System.out.println(filter(students, student -> student.getAge() <= 18));
    }

    static List<Student> filter(List<Student> students, Lambda lambda) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (lambda.test(student)) {
                result.add(student);
            }
        }
        return result;
    }

    static List<Student> filter1(List<Student> students) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if ("男".equals(student.getSex())) {
                result.add(student);
            }
        }
        return result;
    }

    static List<Student> filter2(List<Student> students) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() <= 18) {
                result.add(student);
            }
        }
        return result;
    }
}
