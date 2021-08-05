package ru.geekbrains.homeworks.deque;

import ru.geekbrains.homeworks.deque.Deque;

import java.util.Collection;
import java.util.Iterator;

public class DequeImpl<E> implements Deque<E> {

    public static final int HEAD_DEFAULT = 0;
    public static final int TAIL_DEFAULT = -1;

    protected final E[] data;
    protected int size;

    protected int tail;
    protected int head;
    private int nItems;

    public DequeImpl (int maxSize) {
        this.data = (E[]) new Object[maxSize];
        this.head = HEAD_DEFAULT;
        this.tail = TAIL_DEFAULT;
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }
        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        }

        for (int i = data.length; i>0; i--) {
            if (data[i-1] != null) {
                data[i] = data[i-1];
            }
        }
        data[head] = value;
        size++;
        return true;
    }

    @Override
    public E removeLeft() {
        if (isEmpty()) {
            return null;
        }
        E value = data[tail--];
        //size-=2;

        data[tail+=3] = null;
        return value;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }
        E value = data[head++];
        size+=2;

        data[--head] = null;
        return value;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--> [");
        for (int i = 0; i <= data.length-1; i++) {
            sb.append(data[i]);
            if (i != data.length-1) {
                sb.append(", ");
            }

        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }


    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return data[head];
    }
}
