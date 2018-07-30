public interface Array<T extends Object & Comparable> {

    T getElement(int index);

    void setElement(T value, int index);

    void addElement(T value);

    void display();

    int getSize();

    boolean deleteElement(T value);

    int find(T value);

    void bubbleSort();

    void selectSort();

    void insertSort();

    Array<T> copy();
}
