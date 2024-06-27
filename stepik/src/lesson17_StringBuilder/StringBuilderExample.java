package lesson17_StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Создание StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Добавление строки
        sb.append(" World");
        System.out.println(sb); // "Hello World"

        // Вставка строки
        sb.insert(5, " Java");
        System.out.println(sb); // "Hello Java World"

        // Замена части строки
        sb.replace(6, 10, "Builder");
        System.out.println(sb); // "Hello Builder World"

        // Удаление части строки
        sb.delete(6, 13);
        System.out.println(sb); // "Hello World"

        // Удаление символа
        sb.deleteCharAt(5);
        System.out.println(sb); // "HelloWorld"

        // Переворачивание строки
        sb.reverse();
        System.out.println(sb); // "dlroWolleH"

        // Преобразование в строку
        String str = sb.toString();
        System.out.println(str); // "dlroWolleH"
    }
}
