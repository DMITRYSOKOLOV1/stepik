package lesson16_String;

public class Test1 {
    public static void main(String[] args) {
        /*cоздание объектов String*/
        String s1 = new String("Hello world");
        String s2 = new String("Hello world");
        String s3 = "Hello world";
        String s4 = "Hello world";
        System.out.println(s4 == s3);
        System.out.println(s1 == s2);
    }
}
