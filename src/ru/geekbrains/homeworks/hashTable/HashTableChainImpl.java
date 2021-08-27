package ru.geekbrains.homeworks.hashTable;

import java.util.Iterator;
import java.util.LinkedList;

public class HashTableChainImpl<K, V> extends HashTableImpl<K,V> {

    private final Item<K, V>[]data;
    private final LinkedList list;

    public HashTableChainImpl(int initialCapacity) {
        super(initialCapacity);
        this.data = new Item[initialCapacity*2];
        this.list = new java.util.LinkedList<Integer>();
    }

    @Override
    public boolean put(K key, V value) {
        if (size() == data.length) {
            return false;
        }
        int index = hashFunc(key);

        while (data[index] != null) {
            if (isKeysEquals(data[index], key)) {
                list.add(value);
                data[index].setValue(list);
            }
            index+= getStep(key);
            index %= data.length;
        }

        data[index] = new Item<>(key,value);
        return false;
    }

    @Override
    public void display() {
        System.out.println("--------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d = [%s]%n", i, data[i]);
        }
        System.out.println("--------------------------");
    }

}
