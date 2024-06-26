package lesson20_ArrayList;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add(0,"Python");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
