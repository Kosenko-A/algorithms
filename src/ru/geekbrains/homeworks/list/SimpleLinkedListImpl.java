package ru.geekbrains.homeworks.list;

public class SimpleLinkedListImpl<E> implements LinkedList<E> {

    protected Node<E> firstElement;
    protected int size;

    @Override
    public void insertFirst(E value) {
        firstElement = new Node<E>(value, firstElement);
        size++;
    }

    @Override
    public E removeFirst() {
        if(isEmpty()) {
            return null;
        }

        Node<E> removeNode = firstElement;
        firstElement = removeNode.next;
        removeNode.next = null;

        size--;
        return removeNode.item;
    }

    @Override
    public boolean remove(E value) {
        return false;
    }

    @Override
    public boolean contains(E value) {
        Node<E> current = firstElement;
        while (current!=null) {
            if (current.item.equals(value)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = firstElement;
        while (current!=null) {
            sb.append(current.item);
            if (current.next!=null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public E getFirst() {
        return firstElement.item != null ? firstElement.item : null;

    }

    class Node<E> {
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
}
