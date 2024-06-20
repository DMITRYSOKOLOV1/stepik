package lesson17_StringBuilder;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuffer sbuf2 = new StringBuffer("World");

        String s1 = new String(sb1);
        String s2 = new String(sbuf2);

        System.out.println(s1 + " " + s2);
    }
}
