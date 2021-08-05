package ru.geekbrains.homeworks;


import ru.geekbrains.homeworks.deque.DequeImpl;
import ru.geekbrains.homeworks.queue.Queue;
import ru.geekbrains.homeworks.queue.QueueImpl;

import java.util.Arrays;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {

        //Notebook [] notebooks = new Notebook[5000];

        //for (int i = 0; i < 5000; i++) {
            //notebooks [i] = new Notebook();
        //}

        //sort(notebooks);
        //for (int i = 0; i < 5000; i++ ) {
            //System.out.println(notebooks[i].toString());
        //}

        System.out.println("Homework 3. Task 1.");
        Integer[] arr = MyArray.getArray(10);
        System.out.println(Arrays.toString(arr));
        System.out.println(Search.search(arr));

        System.out.println("Homework 3. Task 2.");
        testDeque();

        System.out.println("Homework 3. Task 3.");
        testQueue();

    }

    private static void testQueue() {
        Queue<Integer> queue = new QueueImpl<>(5);
        System.out.println("Add element: " + queue.insert(12));
        System.out.println("Add element: " + queue.insert(14));
        System.out.println("Add element: " + queue.insert(16));
        System.out.println("Add element: " + queue.insert(17));
        System.out.println("Add element: " + queue.insert(20));
        System.out.println("Add element: " + queue.insert(34));

        queue.display();

        queue.remove();

        queue.display();
    }

    private static void testDeque() {
        DequeImpl<Integer> deque = new DequeImpl<>(5);
        System.out.println("Add element: " + deque.insertLeft(2));
        System.out.println("Add element: " + deque.insertLeft(4));
        System.out.println("Add element: " + deque.insertLeft(6));
        System.out.println("Add element: " + deque.insertRight(7));
        System.out.println("Add element: " + deque.insertRight(10));
        System.out.println("Add element: " + deque.insertRight(14));

        deque.display();
        deque.removeRight();
        deque.display();
        deque.removeLeft();
        deque.display();
    }

    public static Notebook[] sort (Notebook[] notebooks) {
        int gap = notebooks.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int)(gap / 1.25);
            int i = 0;
            swapped = false;
            while (i + gap < notebooks.length) {
                if (notebooks[i].getPrice() > notebooks[i + gap].getPrice()) {
                    Notebook t = notebooks[i];
                    notebooks[i] = notebooks[i + gap];
                    notebooks[i + gap] = t;
                    swapped = true;
                } else if (notebooks[i].getPrice() == notebooks[i + gap].getPrice()) {
                    if (notebooks[i].getRAM() > notebooks[i + gap].getRAM()) {
                        Notebook t = notebooks[i];
                        notebooks[i] = notebooks[i + gap];
                        notebooks[i + gap] = t;
                        swapped = true;
                    } else if (notebooks[i].getRAM() == notebooks[i + gap].getRAM()) {
                        if (notebooks[i].getP() > notebooks[i + gap].getP()) {
                            Notebook t = notebooks[i];
                            notebooks[i] = notebooks[i + gap];
                            notebooks[i + gap] = t;
                            swapped = true;
                        }
                    }
                }
                i++;
            }
        }
        return notebooks;
    }
}

