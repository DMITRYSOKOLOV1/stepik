package lesson20_ArrayList;
import java.util.ArrayList;

public class ArrayListExampleGPT {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Добавление элементов
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Вывод списка
        System.out.println("Initial list: " + list);

        // Добавление элемента по индексу
        list.add(1, "Grapes");
        System.out.println("After adding Grapes: " + list);

        // Получение элемента
        String fruit = list.get(2);
        System.out.println("Element at index 2: " + fruit);

        // Установка значения элемента
        list.set(2, "Mango");
        System.out.println("After setting Mango at index 2: " + list);

        // Удаление элемента по значению
        list.remove("Apple");
        System.out.println("After removing Apple: " + list);

        // Удаление элемента по индексу
        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        // Проверка размера списка
        int size = list.size();
        System.out.println("Size of list: " + size);

        // Проверка наличия элемента
        boolean contains = list.contains("Banana");
        System.out.println("List contains Banana: " + contains);

        // Очистка списка
        list.clear();
        System.out.println("After clearing list: " + list);
    }
}
