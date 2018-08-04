public class HashTableImpl implements HashTable {

    private Item[] data;
    private int capacity;
    private int currentSize;

    public HashTableImpl(int capacity) {
        this.capacity = capacity * 2;
        this.data = new Item[this.capacity];
    }

    @Override
    public boolean insert(Item item) {
        int hashValue = hashFunc(item);//Определяем индекс в массиве с помощью хэш-функции

        int count = 0;
        int step = hashFuncDouble(hashValue);
        //Ищем свободную позицию
        while (data[hashValue] != null) {
            hashValue += step;
            if (++count >= capacity) {//Проверка, что мы не зациклились
                return false;
            }

            hashValue %= capacity;//Цикличический сдвиг в начало массива
        }
        data[hashValue] = item;
        currentSize++;
        return true;
    }

    @Override
    public boolean remove(Item item) {
        return remove(item.hashCode());
    }

    @Override
    public boolean remove(int id) {
        int hashValue = hashFunc(id);

        Item removedItem = find(id);
        if (removedItem == null) {
            return false;
        }

        data[hashValue] = null;
        currentSize--;
        return true;
    }

    @Override
    public Item find(int id) {
        int hashValue = hashFunc(id);
        int count = 0;
        int step = hashFuncDouble(hashValue);

        while (data[hashValue] == null || data[hashValue].getId() != hashValue) {
            hashValue += step;
            if (++count >= capacity) {//Проверка, что мы не зациклились
                return null;
            }
            hashValue %= capacity;//Цикличический сдвиг в начало массива
        }

        return data[hashValue];
    }

    @Override
    public int hashFunc(Item item) {
        return hashFunc(item.hashCode());
    }

    private int hashFunc(int itemId) {
        return itemId % capacity;
    }

    private int hashFuncDouble(int key) {
        return 5 - (key % 5);
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize > 0;
    }

    @Override
    public void display() {
        for (Item item : data) {
            System.out.println(item);
        }
    }
}
