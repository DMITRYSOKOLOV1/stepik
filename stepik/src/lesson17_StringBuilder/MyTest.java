package lesson17_StringBuilder;

public class MyTest {
    public static void main(String[] args) {
        StringBuilder sb10 = new StringBuilder("Hello World");
        String s = null;
        s = (sb10.append(" How are you?").substring(sb10.indexOf("W"), sb10.indexOf("?")));
        System.out.println(s);
    }
}
