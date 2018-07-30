public interface Queue {

    int removeFirst();

    void insertLast(int value);

    int getSize();

    boolean isEmpty();

    boolean isFull();
}
