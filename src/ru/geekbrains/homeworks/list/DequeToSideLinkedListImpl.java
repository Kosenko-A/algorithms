package ru.geekbrains.homeworks.list;

import ru.geekbrains.homeworks.deque.DequeImpl;

import java.util.Iterator;
import java.util.LinkedList;

public class DequeToSideLinkedListImpl implements TwoSideLinkedList{

    LinkedList linkedList = new LinkedList();


    @Override
    public void insertLast(Object value) {
        linkedList.addLast(value);
    }

    @Override
    public Object getLast() {
        return linkedList.getLast();
    }

    @Override
    public void insertFirst(Object value) {
        linkedList.addFirst(value);
    }

    @Override
    public Object removeFirst() {
        Object o = linkedList.getLast();
        linkedList.removeFirst();
        return o;
    }

    @Override
    public boolean remove(Object value) {
        linkedList.remove(value);
        return true;
    }

    @Override
    public boolean contains(Object value) {
        return linkedList.contains(value);
    }

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--> [");
        for (int i = 0; i <= linkedList.size()-1; i++) {
            sb.append(linkedList.get(i));
            if (i != linkedList.size()-1) {
                sb.append(", ");
            }

        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object getFirst() {
        return linkedList.getFirst();
    }


    @Override
    public Iterator iterator() {
        return new DequeIterator();
    }

    public class DequeIterator implements Iterator{

        // набросок итератора, реализовать его задания не было
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
