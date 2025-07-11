package org.example.lambda.closure;

public class ClosureTest1 {
    interface Lambda {
        int add(int y);
    }

    public static void main(String[] args) {
        int x = 10;

        highOrder(y -> x + y);
    }

    static void highOrder(Lambda lambda) {
        System.out.println(lambda.add(20));
    }
}