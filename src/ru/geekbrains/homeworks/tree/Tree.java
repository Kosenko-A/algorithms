package ru.geekbrains.homeworks.tree;

public interface Tree<E extends Comparable<? super E>> {

    boolean add(E value);

    boolean contains(E value);

    boolean remove(E value);

    boolean isEmpty();

    int size();

    void display();

    boolean isBalanced();
}
