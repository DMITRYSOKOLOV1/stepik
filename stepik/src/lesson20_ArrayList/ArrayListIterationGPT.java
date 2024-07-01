package lesson20_ArrayList;
import java.util.ArrayList;


public class ArrayListIterationGPT {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Итерация с помощью цикла for-each
        for (String language : list) {
            System.out.println(language);
        }

        // Итерация с использованием обычного цикла for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Итерация с использованием метода forEach
        list.forEach(language -> {
            System.out.println(language);
        });
    }
}
