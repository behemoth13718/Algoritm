public class Node {

    private Person person;
    private IdBag ID;
    private Node leftChild;
    private Node rightChild;

    public Node(Person person) {
        this.person = person;
    }

    public Node(IdBag ID) {
        this.ID = ID;
    }



    public int getKey() {
        return person.getId();
    }

    public int getKeyId() {
        return ID.getID();
    }


    public Person getPerson() {
        return person;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public void display() {
        System.out.println(person);
    }

    public boolean isLeft(int key) {
        return key < getKeyId();//id
    }

    public boolean isRight(int key) {
        return !isLeft(key);
    }

    public boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }

    /**
     * XOR:
     * 1^1 = 0
     * 1^0 = 1
     * 0^1 = 1
     * 0^0 = 0
     *
     * @return
     */
    public boolean hasOnlyOneChild() {
        return leftChild != null ^ rightChild != null;
    }

    protected boolean deleteChild(Node child) {
        if (leftChild == child) {
            leftChild = null;
            return true;
        }
        else if (rightChild == child) {
            rightChild = null;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(getKeyId());
    }

    public static boolean isBalanced(Node node) {
        return (node == null) ||
                isBalanced(node.leftChild) &&
                        isBalanced(node.rightChild) &&
                        Math.abs(height(node.leftChild) - height(node.rightChild)) <= 1;
    }

    private static int height(Node node) {
        return node == null ? 0 : 1 + Math.max(height(node.leftChild), height(node.rightChild));
    }
}
