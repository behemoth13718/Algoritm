public interface Tree {

    enum TraverseMode {
        PRE_ORDER,//прямой
        POST_ORDER,//обратный
        IN_ORDER,//симметричный
    }

    void insert(Person person);

    void insert(IdBag id);

    boolean remove(int key);

    Person find(int key);

    int getSize();

    boolean isEmpty();

    Person getRoot();

    void traverse(TraverseMode traverseMode);

    void displayTree();


}
