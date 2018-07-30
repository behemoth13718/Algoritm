public class Lesson3_Main {

    public static void main(String[] args) {
//        Stack st = new StackImpl(5);
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
////        st.push(6);
//
//        System.out.println("Stack top = " + st.peek());
//
//        System.out.println("isFull = " + st.isFull());
//
//        while ( !st.isEmpty() ) {
//            System.out.println(st.pop());
//        }

//        st.pop();


//        Brackets bracketsChecker = new Brackets("while ( !st.isEmpty[] ) {System.out.println(st.pop())};");
//        Brackets bracketsChecker = new Brackets("while;");
//        bracketsChecker.check();

//        Queue queue = new QueueImpl(5);
        Queue queue = new PriorityQueue(5);

        addToQueue(queue, 3);
        addToQueue(queue, 1);
        addToQueue(queue, 5);
        addToQueue(queue, 4);
        addToQueue(queue, 2);
        addToQueue(queue, 6);

        while ( !queue.isEmpty() ) {
            System.out.println(queue.removeFirst());
        }

        System.out.println("Finish");
    }

    private static void addToQueue(Queue queue, int value) {
        if ( !queue.isFull() ) {
            queue.insertLast(value);
        }
    }

}
