import java.util.Iterator;

public class Lesson4Main {

    public static void main(String[] args) {

// Реализуем методы из LinkedList

// Вставляем элементы в список:
        LinkedList list1 = new LinkedListImpl();
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(4);
// Выводим на экран заполенный список:
        list1.display();

        System.out.println("----------------");

// Удалаем из списка 3 первых элемента и выводм содержимое на экран:
        list1.removeFirst();

        list1.display();

// Проверяем пустой список или нет, если пустой , то true:
        System.out.println("List is empty? : "+list1.isEmpty());

// Возвращаем размер, первый элемент, первый итем текущего списка:
        System.out.println("Size list = "+list1.getSize());
        System.out.println("FirstElement = "+list1.getFirstElement());
        System.out.println("FirstItem = "+list1.getFirstItem());
        System.out.println("-------------------------");
// Реализуем поиск по списку:
        System.out.println("Find 3 = " + list1.find(3));
        System.out.println("-------------------------");
// Реализуем удаление элемента из списка по значению(true если нашел и удалил) и выводим результат:
        System.out.println("Remove 3 = " + list1.remove(3));
        list1.display();

//Реализуем методы двустороннего списка:
        System.out.println("-------------------------");
        System.out.println("Двусторонние списки");
        System.out.println("-------------------------");
// Заполняем список элементами и выводим на экран:
        TwoWayLinkedList twoWayLinkedList = new TwoWayLinkedListImpl();

        twoWayLinkedList.insertFirst(1);
        twoWayLinkedList.insertFirst(2);
        twoWayLinkedList.insertFirst(3);
        twoWayLinkedList.insertFirst(4);

        twoWayLinkedList.display();
// Вставляем элемент в конец и начало списка:
        System.out.println("-------------------------");
        System.out.println("Вставляем элемент в начало и в концец списка:");
        twoWayLinkedList.insertLast(10);
        twoWayLinkedList.insertFirst(20);
        twoWayLinkedList.display();
//Удаление из списка:
        System.out.println("-------------------------");
        System.out.println("Удаление из списка:");
        System.out.println("-------------------------");
        System.out.println("Удаляем элемент по значению 1");
        twoWayLinkedList.remove(1);
        twoWayLinkedList.display();
        System.out.println("-------------------------");
        System.out.println("Удаляем первый элемент в данном случае 20");
        twoWayLinkedList.removeFirst();
        twoWayLinkedList.display();
// Поиск элемента по значению
        System.out.println("Find 10 = " + twoWayLinkedList.find(10));

        System.out.println("------------------------");
        System.out.println("Проверяем методы итератора из методички");
        System.out.println(" ");

        //
        LinkedList list = new LinkedListImpl();
        LinkedListIterator itr = new LinkedListIterator(list);


        itr.insertAfter(1);
        System.out.println("Нахожусь на 1 элементе : " + itr.getCurrent());
        itr.insertAfter(2);
        System.out.println("Нахожусь на 2 элементе : " + itr.getCurrent());
        itr.insertAfter(3);
        System.out.println("Добавляю 3 элемент и сбрасываю положение интератора на первый элемент");
        itr.reset();
        System.out.println("Нахожусь на 1 элементе  и добавляю после первого элемента 4: " + itr.getCurrent());
        itr.insertAfter(4);
        System.out.println("Нахожусь на 4 элементе : " + itr.getCurrent());
        itr.insertBefore(5);
        System.out.println("Добавляю перед 4 элемент 5");
        System.out.println("Нахожусь на 5 элементе и удаляю его :" + itr.getCurrent());
        itr.deleteCurrent();
        System.out.println("Нахожусь на 4 элементе:" + itr.getCurrent());
        System.out.println("Это конец списка? - " + itr.atEnd());
        itr.nextLink();
        System.out.println("Нахожусь на 2 элементе:" + itr.getCurrent());
        itr.nextLink();
        System.out.println("Нахожусь на 3 элементе:" + itr.getCurrent());
        System.out.println("Это конец списка? - " + itr.atEnd());
        System.out.println("---------------------------");
        list.display();
    }

}
