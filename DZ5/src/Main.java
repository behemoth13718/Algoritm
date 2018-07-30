import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> list = new ArrayList<>();

        list.add(new Item("Биноколь",2,5000));
        list.add(new Item("Аптечка", 4,1500));
        list.add(new Item("Ноутбук", 2,40000));
        list.add(new Item("Котелок", 1,500));
        list.add(new Item("Книга",   1,600));



        Bag bag = new Bag(4);
        bag.calcBestSet(list);
        list = bag.getBestItem();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).NAME + " " + list.get(i).PRICE);
        }
        System.out.println("Count " + bag.COUNT);
    }
}
