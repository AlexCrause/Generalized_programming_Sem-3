package org.example.home_work.task_2;

public class Task2 {

    private static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Массивы не равны по размеру");
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("Массивы не равны по значениям");
                    return false;
                }
            }
            System.out.println("Массивы равны по размеру");
            return true;
        }
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 9};
        Integer[] arr2 = {1, 2, 0};
        System.out.println(compareArrays(arr1, arr2));
    }
}
