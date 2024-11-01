package org.example.task_3;

import java.util.Iterator;
import java.util.List;

/**
 * Написать итератор по массиву. Итератор – это объект, осуществляющий движение по коллекциям любого типа,
 * содержащим любые типы данных. Итераторы обычно имеют только два метода – проверка на наличие
 * следующего элемента и переход к следующему элементу. Но также, особенно в других языках программирования,
 * возможно встретить итераторы, реализующие дополнительную логику.
 */
public class GenericIterator <T> implements Iterator<T> {

    private List<T> list;
    private int index;

    public GenericIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }

    @Override
    public void remove() {
        list.remove(index - 1);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        GenericIterator<Integer> iterator = new GenericIterator<>(list);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
