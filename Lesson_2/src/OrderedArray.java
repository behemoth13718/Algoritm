public class OrderedArray<T extends Object & Comparable> extends ArrayImpl<T> {

    public OrderedArray(int size) {
        super(size);
    }

    @Override
    public void addElement(T value) {
        int index = 0;
        for (index = 0; index < currentSize; index++) {
            if (data[index].compareTo(value) >= 0)
                break;
        }

        for (int i = currentSize; i > index; i--) {
            data[i] = data[ i - 1];
        }

        data[index] = value;
        currentSize++;
    }

    @Override
    public int find(T value) {
        int low = 0;
        int high = currentSize - 1;

        int mid;

        while ( low < high ) {
            mid = (low + high) / 2;
            if (data[mid].equals(value)) {
                return mid;
            }

            if (data[mid].compareTo(value) < 0) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }

        return -1;
    }

    @Override
    public void setElement(T value, int index) {
        throw new UnsupportedOperationException();
    }

}
