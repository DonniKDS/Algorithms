package ru.geekbrains.algorithms.homework5;

import java.util.ArrayList;
import java.util.List;

public class KnapsackProblem {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            items.add(new Item("Thing" + i, (int)(30 * Math.random()), (int)(30000 * Math.random())));
        }
        Knapsack  knapsack = new Knapsack(30);
        knapsack.calcBestSet(items);

        for (Item item : knapsack.getBestSet()) {
            System.out.println(item.getName() + " " + item.getPrice());
        }

        System.out.println("Total best price is " + knapsack.getBestPrice());
    }
}
