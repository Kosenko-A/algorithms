package ru.geekbrains.homeworks.list;

public interface TwoSideLinkedList<E> extends LinkedList<E> {

    void insertLast (E value);

    E getLast();
}
