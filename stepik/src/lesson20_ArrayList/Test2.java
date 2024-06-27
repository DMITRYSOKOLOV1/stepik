package lesson20_ArrayList;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add(3, "Python");
        //for (String s : list) {System.out.println(s);}
        System.out.println(list.get(0));
        //for (String s : list) {System.out.println(s);}
        list.set(0, "Letoile");
        //System.out.println(list.get(0));
        list.remove("Hello");
        for (String s : list) {
            System.out.println("for each " + s);
        }
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        list.addAll(list2);
        list2.set(1,"Ivanov");
        for (String s : list) {
            System.out.println(s);
        }
        //list.clear();
        //for (String s : list) {System.out.println(s + "Пусто");}
    }
}
