package lesson16_String;

public class Test8 {

    public static void main(String[] args) {
        String s1 = "Тест-дизайн — Это этап тестирования по, На котором проектируются и создаются тестовые случаи (Тест-кейсы)";
        String s2 = s1.toUpperCase();
        char c1;
        char c2;
        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if (c1 != ',' && c1 != '-' && c1 != '—' && c1 != ' ' && c1 !='(' && c1 != ')' && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }

    // chatGPT написал
    /* public static void main(String[] args) {
        String s1 = "Тест-дизайн — Это этап тестирования по, На котором проектируются и создаются тестовые случаи (Тест-кейсы)";
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (i != 0 && c >= 'A' && c <= 'Я'){
                result += "\n";
            }
            result += c;
        }
        System.out.println(result);
    } */
}
