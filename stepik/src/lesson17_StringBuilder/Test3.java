package lesson17_StringBuilder;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = sb1;
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(sb3));
    }
}
