package ru.geekbrains.algorithms.homework5;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {

    private final int maxWeight;

    private int bestPrice;
    private List<Item> bestItems = null;

    public Knapsack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    private  int calcWeight(List<Item> items) {
        int sumWeight = 0;
        for (Item item : items) {
            sumWeight += item.getWeight();
        }
        return sumWeight;
    }

    private int calcPrice(List<Item> items) {
        int sumPrice = 0;
        for (Item item : items) {
            sumPrice += item.getPrice();
        }
        return sumPrice;
    }

    private void bestSet(List<Item> items) {
        int sumPrice = calcPrice(items);
        int sumWeight = calcWeight(items);
        if (sumWeight <= maxWeight && (bestItems == null || sumPrice > bestPrice)) {
            bestItems = items;
            bestPrice = sumPrice;
        }
    }

    public List<Item> getBestSet() {
        return bestItems;
    }

    public void calcBestSet(List<Item> items) {
        if (items.isEmpty()) {
            return;
        }

        bestSet(items);

        for (int i = 0; i < items.size(); i++) {
            List<Item> copiedItems = new ArrayList<>(items);
            copiedItems.remove(i);
            calcBestSet(copiedItems);
        }
    }

    public int getBestPrice() {
        return bestPrice;
    }
}
