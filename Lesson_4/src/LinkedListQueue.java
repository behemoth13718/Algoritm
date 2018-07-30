public class LinkedListQueue implements Queue {

    private TwoWayLinkedList linkedList;

    public LinkedListQueue() {
        this.linkedList = new TwoWayLinkedListImpl();
    }

    @Override
    public int removeFirst() {
        return linkedList.removeFirst();
    }

    @Override
    public void insertLast(int value) {
        linkedList.insertLast(value);
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
