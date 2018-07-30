import java.util.Random;

public class Main {

    public static void main(String[] args) {


//        Tree tree = new TreeImpl();
        addNodeId();


//        tree.displayTree();
//
//        addNode(tree, 45);
//        addNode(tree, 30);
//        addNode(tree, 55);
//        addNode(tree, 15);
//        addNode(tree, 5);
//        addNode(tree, 20);

//        System.out.println(tree.remove(30));
    //    System.out.println(tree.remove(45));

      //  System.out.println("Find 15 = " + tree.find(115));

//        tree.traverse(Tree.TraverseMode.PRE_ORDER);


    }

//    private static void addNode(Tree tree, int id) {
//        Person person = new Person("Pavel", id, id);
//        tree.insert(person);
//    }
static int current =0;


    private static int random(){
        int a = 0;
        int b = 20;
        int id = a + (int) (Math.random() * b);
        return id;
    }

    private static void addNodeId() {
        Tree tree = new TreeImpl();
        do {
            IdBag idBag = new IdBag(random());
            tree.insert(idBag);
            current++;
        }while (current != 10);
                tree.displayTree();

    }


}
