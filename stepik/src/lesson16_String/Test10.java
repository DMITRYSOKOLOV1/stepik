package lesson16_String;

public class Test10 {
    public static void main(String[] args) {
        String x = "Hello";
        String y = "Hello".trim(); // trim ничего не поменял поэтому равны
        System.out.println(x == y);

        String s1 = "Hello";
        String s2 = " Hello".trim();
        System.out.println(s1 == s2); // trim поменял и сделал новый объект поэтому не равны
    }
}
