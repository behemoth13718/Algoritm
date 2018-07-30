public interface LinkedList extends Iterable<Integer> {

    //O(1)
    int removeFirst();

    //O(1)
    void insertFirst(int value);

    boolean isEmpty();

    int getSize();

    void display();

    Integer getFirstElement();

    Item getFirstItem();

    void setFirstElement(Item firstElement);

    //O(N)
    boolean find(int value);

    //O(N)
    boolean remove(int value);


}
