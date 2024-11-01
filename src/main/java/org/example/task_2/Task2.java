package org.example.task_2;

import java.util.Arrays;

/**
 * Описать собственную коллекцию – список на основе массива.
 * Коллекция должна иметь возможность хранить любые типы данных, иметь методы добавления и удаления элементов.
 */
public class Task2<T> {

    private Object[] array;
    private int size;

    public Task2(int length) {
        this.array = new Object[length];
    }

    public void addToArray(T element) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = element;
    }

//    public void deleteFromArray(T element) {
//        array[--size] = element;
//    }
    public void deleteFromArray(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null; // Освобождаем последнее значение
                size--; // Уменьшаем размер
                break;
            }
        }
    }


    public static void main(String[] args) {
        Task2<String> task2 = new Task2<>(5);
        task2.addToArray("Hello");
        task2.addToArray("World");
        task2.addToArray("?");
        task2.addToArray("!");
        task2.deleteFromArray("?");
        System.out.println(Arrays.toString(task2.array));
    }
}
