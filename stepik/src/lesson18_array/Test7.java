package lesson18_array;

public class Test7 {
    public static void main(String[] args) {
        char[] array = new char[]{'H', 'e', 'l', 'l', 'o'};
        String s = new String(array); // еще конструктор класса String
        System.out.println(s);

        StringBuilder sb1 = new StringBuilder("ok");
        System.out.println(sb1.append(array,0,2)); // метод append

        System.out.println(sb1.insert(2,array,1,3));
    }
}
