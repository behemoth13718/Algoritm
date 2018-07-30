import java.util.Arrays;

public class ArrayImpl<T extends Object & Comparable> implements Array<T> {

    protected int currentSize;
    protected T[] data;

    public ArrayImpl(int size) {
        this.currentSize = 0;
        this.data = (T[]) new Object[size];
//        this.data = (T[]) new Object[size];
    }

    private ArrayImpl(T[] array, int size) {
        currentSize = size;
        data = array;
    }

    @Override
    public T getElement(int index) {
        return data[index];
    }

    @Override
    public void setElement(T value, int index) {
        data[index] = value;
    }

    @Override
    public void addElement(T value) {
        data[currentSize++] = value;
    }

    @Override
    public void display() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(data[i]);
        }
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override//O(N)
    public int find(T value) {
        int targetIndex = -1;
        for (targetIndex = 0; targetIndex < currentSize; targetIndex++) {
            if ( data[targetIndex].equals(value) )
                return targetIndex;
        }

        return -1;
    }

    @Override//O(N^2)
    public void bubbleSort() {
        for (int i = 0; i < currentSize - 1; i++) {
            for (int j = 0; j < currentSize - 1 - i; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    exchange(j, j + 1);
                }
            }
        }
    }

    @Override
    public void selectSort() {
        int minValueIndex;

        for (int i = 0; i < currentSize - 1; i++) {
                minValueIndex = i;
            for (int j = i + 1; j < currentSize; j++) {
                if (data[j].compareTo(data[minValueIndex]) < 0) {
                    minValueIndex = j;
                }
            }

            if (minValueIndex != i) {
                exchange(i, minValueIndex);
            }
        }
    }

    private void exchange(int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    @Override
    public void insertSort() {
        for (int i = 1; i < currentSize; i++) {
            T temp = data[i];
            int index = i;
            while (index > 0 && data[index - 1].compareTo(temp) >= 0) {
                data[index] = data[index - 1];
                index--;
            }
            data[index] = temp;
        }
    }

    @Override
    public Array<T> copy() {
        return new ArrayImpl<>(Arrays.copyOf(data, data.length), currentSize);
    }

    @Override
    public boolean deleteElement(T value) {
        int targetIndex = find(value);

        if (targetIndex == -1)
            return false;

        for (int i = targetIndex; i < currentSize - 1; i++) {
            data[i] = data[i + 1];
        }

        currentSize--;
        return true;
    }
}
