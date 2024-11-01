package org.example.home_work.task_3;

public class Pair<T, S> {

    private final T first;
    private final S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public S getSecond(){
        return second;
    }

    @Override
    public String toString() {
        return "Пара: " + first + ", " + second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "1");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}
