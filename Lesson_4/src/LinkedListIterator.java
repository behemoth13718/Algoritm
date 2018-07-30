import java.util.Iterator;

public class LinkedListIterator implements Iterator<Integer> {

    private LinkedList list;
    private boolean firstIterate = true;
    private Item previous;
    private Item current;

    public LinkedListIterator(LinkedList list) {
        this.list = list;
        this.reset();
    }

    public void reset() {
        current = list.getFirstItem();
        previous = null;
    }

    public boolean atEnd(){
        return (current.nextItem == null);
    }

    public void nextLink(){
        previous = current;
        current = current.nextItem;
    }

    public Item getCurrent(){
        return current;
    }

    public void insertAfter(int Value){
        Item newitem = new Item(Value);
        if (list.isEmpty()){
            list.setFirstElement(newitem);
            current = newitem;
        }
        else {
             newitem.nextItem = current.nextItem;
             current.nextItem = newitem;
             nextLink();
        }
    }

    public void insertBefore(int Value){
        Item newitem = new Item(Value);
        if (previous == null){
            newitem.nextItem = list.getFirstItem();
            list.setFirstElement(newitem);
            reset();
        }
        else {
            newitem.nextItem = previous.nextItem;
            previous.nextItem = newitem;
            current = newitem;
        }
    }

    public int deleteCurrent(){
        int value = current.value;
        if (previous == null){
            list.setFirstElement(current.nextItem);
            reset();
        }
        else {
            previous.nextItem = current.nextItem;
            if (atEnd()){
                reset();
            }
            else {
                current = current.nextItem;
            }
        }
        return value;
    }

    @Override
    public boolean hasNext() {
        if (firstIterate) {
            firstIterate = false;
            return list.getFirstElement() != null;
        }
        else {
            return current.getNextItem() != null;
        }
    }

    @Override
    public Integer next() {
        if (current == null) {
            current = list.getFirstItem();
        }
        else {
            current = current.getNextItem();
        }
        return current.getValue();
    }

    @Override
    public void remove() {
        list.remove(current.getValue());
    }
}
