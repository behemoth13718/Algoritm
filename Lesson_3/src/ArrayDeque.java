public class ArrayDeque implements Deque {

    private static final int DEFAULT_FRONT = 0;
    private static final int DEFAULT_REAR = -1;

    private int[] array;
    int maxSize;

    int itemsCount = 0;

    int front = DEFAULT_FRONT;
    int rear = DEFAULT_REAR;


    public ArrayDeque(int maxSize) {
        this.maxSize = maxSize;
        this.array = new int[maxSize];
    }

    @Override
    public void insertFirst(int value) {
        if (front - 1 < 0)
            front = maxSize;

        array[--front] = value;
        itemsCount++;
    }

    @Override
    public int removeLast() {
        if (rear < 0)
            rear = maxSize - 1;

        int value = array[rear--];
        itemsCount--;

        return value;
    }

    @Override
    public boolean isEmpty() {
        return itemsCount == 0;
    }

    @Override
    public boolean isFull() {
        return itemsCount == maxSize;
    }

    @Override
    public int getSize() {
        return itemsCount;
    }

    @Override
    public void insertLast(int value) {
        if (rear == maxSize - 1)
            rear = DEFAULT_REAR;

        array[++rear] = value;
        itemsCount++;
    }

    @Override
    public int removeFirst() {
        int value = array[front++];

        if (front == maxSize) {
            front = DEFAULT_FRONT;
        }

        itemsCount--;

        return value;
    }

}
