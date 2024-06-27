package lesson20_ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Test5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
        //System.out.println(list1.get(0) == list2.get(0));
        list1.get(0).append("!!!");
        System.out.println(list2.get(0));

        list1.set(0, new StringBuilder("D"));
        System.out.println(list1.get(0));
        System.out.println(list2.get(0));
    }
}

class Test5_1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        Object[] array1 = list1.toArray();
        for (Object o : array1) {
            System.out.print(o + " ");
        }
        System.out.println();
        StringBuilder[] array2 = list1.toArray(new StringBuilder[5]);
        for (StringBuilder sb : array2) {
            System.out.print(sb + " ");
        }
    }
}
