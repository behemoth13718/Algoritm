import java.util.ArrayList;
import java.util.List;

public class Bag {
    private int MAX_WEIGHT;
    private int MAX_PRICE;
    private List<Item> bestItem = null;
    public int COUNT = 0;

    public Bag(int MAX_WEIGHT){
        this.MAX_WEIGHT = MAX_WEIGHT;
    }

        private int calcPrice(List<Item> items){
            int sumPrice= 0;
            for (Item item : items){
                sumPrice += item.PRICE;
            }
            return sumPrice;
        }

        private int calcWeight(List<Item> items){
            int sumWeight = 0;
            for (Item item : items){
                sumWeight += item.WEIGHT;
            }
            return sumWeight;
        }

    public void bestSet(List<Item> items) {
        if (bestItem == null) {
            if (calcWeight(items) <= MAX_WEIGHT) {
                bestItem = items;
                MAX_PRICE = calcPrice(items);
            }
        } else {
                if (calcWeight(items) <= MAX_WEIGHT && calcPrice(items) > MAX_PRICE){
                   bestItem = items;
                   MAX_PRICE = calcPrice(items);
            }
        }
    }

    public void calcBestSet(List<Item> items){
            if (items.size() > 0){
                bestSet(items);
                COUNT++;
            }
            for (int i = 0; i < items.size(); i++) {
                List<Item> list = new ArrayList<>(items);
                list.remove(i);
                calcBestSet(list);
        }
    }

    public List<Item> getBestItem() {
        return bestItem;
    }
}

