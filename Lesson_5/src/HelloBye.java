public class HelloBye {

    public static void main(String[] args) {
        hello("Oleg");
    }

    private static void hello(String name) {
        display("Hello, " + name);
        bye(name);
    }

    private static void bye(String name) {
        display("Good bye, " + name);
    }

    private static void display(String str) {
        System.out.println(str);
        //5! = 5 * 4 *3 *2 *1 = 120
    }

}
