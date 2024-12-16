/* Given the weights and profits of N items, in the form of (profit, weight) put these items in a knapsack of capacity W to get the maximum total profit in the knapsack. In Fractional Knapsack, we can break items for maximizing the total value of the knapsack.

Input: arr[][]={{60,10}, {100,20}, {120, 30}}, W=50
Output: 240

Time Complexity: O(nlogn)
Space Complexity: O(N)

*/

import java.util.*;

public class FractionalKnapSack {
    private static class Item {
        Integer value;
        Integer weight;

        public String toString() {
            return value + " " + weight;
        }
    }

    private static class ItemComparator implements Comparator<Item> {
        public int compare(Item i1, Item i2) {
            if ((i1.value / i1.weight) < (i2.value / i2.weight))
                return 1;
            else if ((i1.value / i1.weight) > (i2.value / i2.weight))
                return -1;
            else
                return 0;
        }
    }

    public static void main(String args[]) {
        List<Integer> value = List.of(60, 150, 100, 120);
        List<Integer> weights = List.of(10, 50, 20, 15);
        List<Item> itemsList = new ArrayList<>();
        for (int i = 0; i < value.size(); i++) {
            Item item = new Item();
            item.value = value.get(i);
            item.weight = weights.get(i);
            itemsList.add(item);
        }
        itemsList.sort(new ItemComparator());
        System.out.println(itemsList);
        int W = 30, profit = 0;
        while (W > 0) {
            for (int i = 0; i < itemsList.size(); i++) {
                Item item = itemsList.get(i);
                if (item.weight < W) {
                    profit += item.value;
                    W -= item.weight;
                } else {
                    profit += (item.value) / item.weight * W;
                    W = 0;
                }
            }
        }
        System.out.println("\n" + profit);
    }

}
