public class Item {

    public final int value;
    public Item nextItem;

    public Item(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Item getNextItem() {
        return nextItem;
    }

    public void setNextItem(Item nextItem) {
        this.nextItem = nextItem;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (value != item.value) return false;
        return nextItem != null ? nextItem.equals(item.nextItem) : item.nextItem == null;
    }

    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                '}';
    }
}
