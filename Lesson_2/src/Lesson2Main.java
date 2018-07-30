import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Lesson2Main {

    public static void main(String[] args) {
//        Integer[] a = {1, 2, 3, 4, 5};
//
//        a[2] = a[3];
//        a[3] = a[4];
//        a[4] = null;
//
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

//        Array array = new OrderedArray(5);
//        array.addElement(3);
//        array.addElement(4);
//        array.addElement(1);
//        array.addElement(5);
//        array.addElement(2);
//
//        System.out.println("Size is " + array.getSize());
//        array.display();
//
//        System.out.println("Deleting 2");
////
//        boolean needDelete = true;
//        while ( needDelete ) {
//            needDelete = array.deleteElement(2);
//        }
//        array.display();
////
//        System.out.println("Position of value 3 is " + array.find(3));

        Array<Double> array = new OrderedArray(5);
        array.addElement(3.0);
        array.addElement(4.6);
        array.addElement(1.7);
        array.addElement(5.4);
        array.addElement(2.2);

        System.out.println("Size is " + array.getSize());
        array.display();

        Array<Integer> arr = new ArrayImpl<>(5);
        arr.addElement(3);
        arr.addElement(1);
        arr.addElement(8);
        arr.addElement(4);
        arr.addElement(2);

        System.out.println("-------");

        arr.display();

        System.out.println("SORT!!!");
        System.out.println("Insert sort");

        arr.insertSort();
        arr.display();

        System.nanoTime();

    }
}
