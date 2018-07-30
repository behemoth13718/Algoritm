import java.util.Objects;

public class Item {
    String NAME;
    int WEIGHT;
    int PRICE;

    public Item(String NAME, int WEIGHT, int PRICE) {
        this.NAME = NAME;
        this.WEIGHT = WEIGHT;
        this.PRICE = PRICE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return WEIGHT == item.WEIGHT &&
                PRICE == item.PRICE &&
                Objects.equals(NAME, item.NAME);
    }

    @Override
    public String toString() {
        return "Item{" +
                "NAME='" + NAME + '\'' +
                ", WEIGHT=" + WEIGHT +
                ", PRICE=" + PRICE +
                '}';
    }
}
