public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTableImpl(10);
        hashTable.insert(new Item(1, "Арбуз", 10));

        hashTable.insert(new Item(14, "Картофель", 50));

        hashTable.insert(new Item(10, "Огурец", 30));
        hashTable.insert(new Item(7, "Помидор", 40));
        Item banan = new Item(4, "Банан", 20);
        hashTable.insert(banan);

        hashTable.insert(new Item(34, "Картофель_34", 50));
        hashTable.insert(new Item(54, "Картофель_54", 50));


        hashTable.display();

        System.out.println("----------------");
        System.out.println("Find Банан: " + hashTable.find(banan.hashCode()));
        System.out.println("----------------");
        hashTable.remove(10);
        hashTable.display();
    }
}
