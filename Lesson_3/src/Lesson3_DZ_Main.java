import java.util.Stack;

public class Lesson3_DZ_Main {
    public static void main(String[] args) {
//        String str = "abcd";
//
//        Stack st = new Stack();
//        for (int i = 0; i < str.length(); i++) {
//            st.push(str.charAt(i));
//        }
//
//        while ( !st.isEmpty() ) {
//            System.out.print(st.pop());
//        }
//
//        if (true)
//            return;

        Deque deq = new ArrayDeque(6);
        deq.insertLast(1);
        deq.insertLast(2);
        deq.insertLast(3);
        deq.insertLast(4);// 1 2 3 4
        deq.insertFirst(5); // 5 1 2 3 4
        deq.insertFirst(6); // 6 5 1 2 3 4

        deq.removeFirst(); //5 1 2 3 4
        deq.removeLast(); // 5 1 2 3
//        displayLeftToRight(deq); // Queue
        displayRightToLeft(deq); //Stack
    }

    private static <T> void displayRightToLeft(Deque deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLast());
        }
    }

    private static <T> void displayLeftToRight(Deque deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeFirst());
        }
    }
}
