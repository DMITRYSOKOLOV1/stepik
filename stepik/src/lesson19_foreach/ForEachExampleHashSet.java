package lesson19_foreach;

import java.util.HashSet;
import java.util.Set;

public class ForEachExampleHashSet {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Использование foreach для перебора множества
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
