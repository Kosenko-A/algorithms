package ru.geekbrains.homeworks.recursion;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    int maxPrice;
    private List<Thing> things;
    private int bestPrice;
    private List <Thing> bestThings;
    private int maxWeight;


    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int totalPrice(List<Thing> things) {
        int price = 0;
        for (Thing thing : things) {
            price += thing.getPrice();
        }
        return price;
    }

    public int totalWeight(List<Thing> things) {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public void checkList(List<Thing> things) {
        if (bestThings == null && totalWeight(things) <= maxWeight) {
            bestThings = things;
            bestPrice = totalPrice(things);
        } else if (totalWeight(things) <= maxWeight && totalPrice(things) > bestPrice) {
            bestThings = things;
            bestPrice = totalPrice(things);
        }
    }

    public void findAllList(List<Thing> things) {
        if (things.size() > 0) {
            checkList(things);
        }

        for (int i = 0; i < things.size(); i++) {
            List<Thing> tempList = new ArrayList<>(things);
            tempList.remove(i);
            findAllList(tempList);
        }
    }

    public List<Thing> getBestThings() {
        return bestThings;
    }

    public int getBestPrice() {
        return bestPrice;
    }

}
