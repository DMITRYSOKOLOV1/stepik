package lesson19_foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachExampleArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Использование foreach для перебора списка
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
