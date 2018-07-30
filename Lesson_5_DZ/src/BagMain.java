import java.util.ArrayList;
import java.util.List;

public class BagMain {

    public static void main(String[] args) {

        List<Item> itemlist = new ArrayList<>();

        itemlist.add(new Item("Книга",1,600));
        itemlist.add(new Item("Биноколь",2,5000));
        itemlist.add(new Item("Аптечка",4,1500));
        itemlist.add(new Item("Ноутбук",2,40000));
        itemlist.add(new Item("Котелок",1,500));

        System.out.println(itemlist);

    }

    public class Best {

        private int bestPrice (Item item){
            int MAXPRICE = 0;

            return MAXPRICE;
        }

        private int bestWeight (Item item){
            int MIN_WEIGHT = 0;
            return MIN_WEIGHT;
        }

        private Item bestCombinate (int price,int weight ){
            Item combinate= null;
            return combinate;
        }
    }
    //вычисляет общий вес набора предметов

//    private Item CalcWeigth(List<Item> items)
//    {
//        Item sumW = 0;
//
//        for (int i = 0; i < items.size() ; i++) {
//            sumW += i.
//
//        }
//
//        return sumW;
//    }

//    //вычисляет общую стоимость набора предметов
//    private double CalcPrice(List<Item> items)
//    {
//        double sumPrice = 0;
//
//        for (Item i in items)
//        {
//            sumPrice += i.price;
//        }
//
//        return sumPrice;
//    }
}
