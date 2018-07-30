public class OrderedRecArray<T extends Object & Comparable> extends OrderedArray<T> {

    public OrderedRecArray(int size) {
        super(size);
    }

    @Override
    public int find(T value) {
        return recBinaryFind(value, 0, getSize() - 1);
    }

    private int recBinaryFind(T value, int low, int high) {
        int mid = (low + high) / 2;
        T currentValue = data[mid];
        if (value.equals(currentValue)) {
            return mid;
        }
        else if (low > high)
            return -1;
        else {
            if (data[mid].compareTo(value) < 0) {
                return recBinaryFind(value, mid + 1, high);
            }
            else {
                return recBinaryFind(value, low, mid - 1);
            }
        }
    }
}
