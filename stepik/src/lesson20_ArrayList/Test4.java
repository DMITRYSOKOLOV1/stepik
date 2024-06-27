package lesson20_ArrayList;
import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        for (StringBuilder s : list) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(list.indexOf(new StringBuilder("hello")));

        System.out.println(list.contains("privet") + " -метод contains");

        System.out.println(list.toString() + " -метод contains toString");
    }
}

class Test4_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("hello"));
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(new String("hello"));
        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(list.indexOf(new String("hello")));
        System.out.println(list.lastIndexOf(new String("hello")));

        System.out.println(list.size());
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println(list.isEmpty());
        System.out.println(list2.isEmpty());

        System.out.println(list.contains("privet") + " -метод contains"); //используется equels

    }
}
