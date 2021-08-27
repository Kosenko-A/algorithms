package ru.geekbrains.homeworks.deque;

import java.util.Queue;

public interface Deque <E> extends Queue<E> {

    boolean insertLeft (E value);
    boolean insertRight (E value);

    E removeLeft();
    E removeRight();

    boolean isFull();

    void display();
}
