import java.io.File;

public class Lesson5Main {

    public static void main(String[] args) {
        int value = -5;
//        while (value > 0) {
//            System.out.println(value);
//            value--;
//        }
//        countdown(value);

//        System.out.println(factorial(5));
//
//        File file = new File("c:\\Users\\krylo\\Google Диск\\GeekBrains\\Алгоритмы и структуры данных\\курс от 10.07.2018\\");
//        displayFiles(file, "");
//
//        Anagramm anagramm = new Anagramm("кот");
//        anagramm.getAnagramm();

        Array<Integer> arr = new OrderedRecArray(5);
        arr.addElement(1);
        arr.addElement(2);
        arr.addElement(3);
        arr.addElement(4);
        arr.addElement(5);
        arr.display();
        int search = 8;
        System.out.println("Search position = " + arr.find(search));

    }

    private static void displayFiles(File dir, String prefix) {
        System.out.println(prefix + "DIR: " + dir.getName());
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                displayFiles(file, "    " + prefix);
            }
            else {
                System.out.println(prefix + "FILE: " + file.getName());
            }
        }
    }

    private static int countdown(int value) {
        if (value > 0) {
            return value;
        }
        System.out.println(value);
        return countdown(value - 1);
    }

    private static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }

}
