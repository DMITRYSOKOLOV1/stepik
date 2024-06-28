package lesson20_ArrayList;

import java.util.ArrayList;

public class Test8 {//доп методы ArrayList и List

    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1 - " + al1);
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("one");
        al2.add("three");
        al2.add("four");
        al2.add("ten");

        //al1.removeAll(al2);
        //System.out.println("al1 - " + al1);
        //al1.retainAll(al2);
        //System.out.println("al1 - " + al1);
        boolean result = al1.containsAll(al2);
        System.out.println(result);

    }
}
