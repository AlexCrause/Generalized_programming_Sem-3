package org.example.home_work.task_1;

public class Calculator {

    private static <T extends Number> double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    private static <T extends Number> double multiply(T a, T b){
        return a.doubleValue() * b.doubleValue();
    }

    private static <T extends Number> double divide(T a, T b){
        return a.doubleValue() / b.doubleValue();
    }

    private static <T extends Number> double subtract(T a, T b){
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(multiply(1,2));
        System.out.println(divide(1,2.5f));
        System.out.println(subtract(1,2));
    }
}
