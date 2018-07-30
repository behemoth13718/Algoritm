import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class Anagramm {

    private String word;
    private final char[] arr;
    private final int size;

    private Set<String> anagramms = new LinkedHashSet<>();

    public Anagramm(String word) {
        this.word = word;
//        this.arr = initArray(word);
        this.arr = word.toCharArray();
        size = word.length();
    }

    private char[] initArray(String word) {
        char[] array = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            array[i] = word.charAt(i);
        }
        return array;
    }

    public void getAnagramm() {
        getAnagramm(size);
        for (String anagramm : anagramms) {
            System.out.println(anagramm);
        }
    }

    private void getAnagramm(int currentSize) {
        if (currentSize == 1)
            return;

        for (int i = 0; i < currentSize; i++) {
            getAnagramm(currentSize - 1);
            anagramms.add(new String(arr));
//            if (currentSize == 2) {
//                display();
//            }
            rotate(currentSize);
        }
    }

    private void rotate(int currentSize) {
        int pos = size - currentSize;
        char temp = arr[pos];//кот
        for (int i = pos + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }//ктт
        arr[size - 1] = temp;//кто
    }

    private void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
}
