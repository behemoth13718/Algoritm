public class LessonOneMain {

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);

        Person p  = new Person("Oleg", 26);//001
        Person p2 = new Person("Oleg", 26);//002

        System.out.println(p);

        System.out.println(a == 5);
        System.out.println(p == p2);//001 == 002

        System.out.println(p.equals(p2));

        System.out.println("-----------------");

        System.out.println("a = " + a);//003
        test(a);
        System.out.println("a = " + a);

        System.out.println("-----------------\"");

        System.out.println(p);//001
        test2(p);//001
        System.out.println(p);//001


        System.out.println("-----------------\"");

        System.out.println(p);//001
        test3(p);//001
        System.out.println(p);//001


    }

    private static void test(int age) {
        age = 7;//004
        System.out.println(age);
    }

    private static void test2(Person person) {//001
        person = new Person("Pavel", 25);//005
        System.out.println(person);//005
    }



    private static void test3(Person person) {//001
        person.setName("Pavel");//001
        person.setAge(18);
        System.out.println(person);//001
    }



}
