//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//    public class Knapsack {
//
//        private static final List<Item> ITEMS = new ArrayList<>();
//        private static final Map<Integer, Bag> CACHE = new HashMap<>();
//        private static final boolean FINITE_ITEMS = true; //whether an item can be added more than once
//
//        public static void main(String[] args) {
//            ITEMS.add(new Item(600, 1, "Книга"));
//            ITEMS.add(new Item(5000, 2, "Бинокль"));
//            ITEMS.add(new Item(1500, 4, "Аптечка"));
//            ITEMS.add(new Item(40000, 2, "Ноутбук"));
//            ITEMS.add(new Item(500, 1, "Котелок"));
//
//
//            Bag best = bestCombination(10);
//            System.out.println(best.toString());
//        }
//
//        public static Bag bestCombination(int capa) {
//            if (CACHE.containsKey(capa)) return CACHE.get(capa);
//            if (capa < 0) return null;
//            if (capa == 0) return new Bag(0, 0);
//
//            int currentWeight = -1;
//            int currentValue = -1;
//            String newItem = null;
//            List<String> previousItems = null;
//            for (Item p : ITEMS) {
//                Bag previous = bestCombination(capa - p.weight);
//                if (previous == null) continue;
//
//                int weightSoFar = previous.Max_weight;
//                int valueSoFar = previous.Max_price;
//                int nextBestValue = 0;
//                Item candidateItem = null;
//                for (Item candidate : ITEMS) {
//                    if (FINITE_ITEMS && previous.alreadyHas(candidate)) continue;
//                    if (weightSoFar + candidate.weight <= capa && nextBestValue < valueSoFar + candidate.price) {
//                        candidateItem = candidate;
//                        nextBestValue = valueSoFar + candidate.price;
//                    }
//                }
//
//                if (candidateItem != null && nextBestValue > currentValue) {
//                    currentValue = nextBestValue;
//                    currentWeight = weightSoFar + candidateItem.weight;
//                    newItem = candidateItem.name;
//                    previousItems = previous.contents;
//                }
//            }
//
//            if (currentWeight <= 0 || currentValue <= 0) throw new RuntimeException("cannot be 0 here");
//            Bag bestBag = new Bag(currentWeight, currentValue);
//            bestBag.add(previousItems);
//            bestBag.add(Collections.singletonList(newItem));
//            CACHE.put(capa, bestBag);
//            return bestBag;
//        }
//
//    }
//
//    class Item {
//
//        int price;
//        int weight;
//        String name;
//
//        Item(int price, int weight, String name) {
//            this.price = price;
//            this.weight = weight;
//            this.name = name;
//        }
//
//    }
//
//    class Bag {
//
//        List<String> contents = new ArrayList<>();
//        int Max_weight;
//        int Max_price;
//
//
//        Bag(int Max_weight, int Max_price) {
//            this.Max_weight = Max_weight;
//            this.Max_price = Max_price;
//        }
//
//        boolean alreadyHas(Item item) {
//            return contents.contains(item.name);
//        }
//
//        @Override
//        public String toString() {
//            return "Максимальный вес : " + Max_weight + " , Максимальная цена : " + Max_price + "\n" + contents.toString();
//        }
//
//        void add(List<String> name) {
//            contents.addAll(name);
//        }
//
//
//
//    }
//
