package lesson16_String;

public class StringExamples {
    public static void main(String[] args) {
        // Создание строки
        String str = "Hello, World!";

        // Длина строки
        int length = str.length();
        System.out.println("Length: " + length);

        // Получение символа
        char ch = str.charAt(1);
        System.out.println("Character at index 1: " + ch);

        // Подстрока
        String sub = str.substring(7, 12);
        System.out.println("Substring: " + sub);

        // Объединение строк
        String concatenated = str.concat(" Welcome!");
        System.out.println("Concatenated: " + concatenated);

        // Индекс первого вхождения
        int indexOfW = str.indexOf("W");
        System.out.println("Index of 'W': " + indexOfW);

        // Преобразование в верхний регистр
        String upper = str.toUpperCase();
        System.out.println("Upper case: " + upper);

        // Преобразование в нижний регистр
        String lower = str.toLowerCase();
        System.out.println("Lower case: " + lower);

        // Удаление пробелов
        String trimmed = str.trim();
        System.out.println("Trimmed: " + trimmed);

        // Заменить символы
        String replaced = str.replace('o', '0');
        System.out.println("Replaced: " + replaced);

        // Разделение строки
        String[] parts = str.split(", ");
        for (String part : parts) {
            System.out.println("Part: " + part);
        }

        // Сравнение строк
        boolean isEqual = str.equals("Hello, World!");
        System.out.println("Equals: " + isEqual);

        // Сравнение строк без учета регистра
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("Equals Ignore Case: " + isEqualIgnoreCase);
    }
}

