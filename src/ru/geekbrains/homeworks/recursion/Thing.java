package ru.geekbrains.homeworks.recursion;

public class Thing {

    private String name;
    private int weight;
    private int price;

    public Thing(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }
}
