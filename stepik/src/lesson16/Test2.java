package lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        int a = s1.length(); // кол-во элементов в массиве String
        System.out.println(a);

        char c1 = s1.charAt(0); // какой элемент находится на индексе в скобках
        System.out.println(c1);

        int i1 = s1.indexOf("H");// на каком индексе находится
        System.out.println(i1);

        int i2 = s1.indexOf("llo");
        System.out.println(i2);

        String s2 = new String("abcdefgabcd");
        int i3 = s2.indexOf("a",5); // на каком индексе находится "a", искать с 5 элемента
        System.out.println(i3);

        boolean b1 = s2.startsWith("abc"); // начинается с
        System.out.println(b1);

        boolean b2 = s2.startsWith("abc",6); // начинается с, с элемента номер
        System.out.println(b2);

        boolean b3 = s1.endsWith("lo"); // заканчивается
        System.out.println(b3);



    }
}
