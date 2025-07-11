package org.example.lambda.studentexp;

public class Type3Test {

    /**
     * 类名::非静态方法名
     *
     * @param args
     */
    public static void main(String[] args) {
        // 方法引用：将 Student::hello 引用传入高阶函数 highOrder
        // 等价于 lambda: (stu, msg) -> stu.hello(msg)
        highOrder(Student::hello);
    }

    /**
     * 高阶函数：接收一个函数式接口 Type3 的实现（Lambda 或方法引用）
     */
    static void highOrder(Type3 lambda) {
        // 创建一个 Student 对象
        Student stu = new Student("张三");

        // 执行传入的 lambda 表达式（即 Student::hello）
        // 实际运行：stu.hello("你好")
        String result = lambda.transfer(stu, "你好");

        // 输出: 张三 say: 你好
        System.out.println(result);
    }

    /**
     * 自定义函数式接口：接收一个 Student 和一个 String，返回一个 String
     * 这是为了匹配方法引用 Student::hello 的结构
     */
    interface Type3 {
        String transfer(Student stu, String message);
    }

    /**
     * 学生类
     */
    static class Student {
        String name;

        public Student(String name) {
            this.name = name;
        }

        // 成员方法：接收一个 message，返回问候语
        public String hello(String message) {
            return this.name + " say: " + message;
        }
    }
}
