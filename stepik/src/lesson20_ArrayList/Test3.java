package lesson20_ArrayList;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("World");
        StringBuilder sb3 = new StringBuilder("OKEY");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }
        list.remove(2);
        list.remove(sb1);
        for(StringBuilder sb: list) {
            System.out.println(sb);
        }

    }
}
