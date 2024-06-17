package lesson16_String;

public class Test7 {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "Hello";
        String str3 = str.concat(str2).trim().replace("Hello","Privet").substring(6,10);
        System.out.println(str.substring((str.indexOf('W'))));
    }
}
