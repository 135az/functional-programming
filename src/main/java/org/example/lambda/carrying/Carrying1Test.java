package org.example.lambda.carrying;

public class Carrying1Test {
    public static void main(String[] args) {
        highOrder(a -> b -> a + b);
    }

    static void highOrder(Step1 step1) {
        Step2 step2 = step1.exec(10);
        System.out.println(step2.exec(20));
        System.out.println(step2.exec(50));
    }

    interface Step1 {
        Step2 exec(int a);
    }

    interface Step2 {
        int exec(int b);
    }
}