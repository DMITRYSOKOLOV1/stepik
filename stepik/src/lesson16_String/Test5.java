package lesson16_String;

public class Test5 {
    public static void main(String[] args) {
        String s = null; //не ссылается ни на какой объект
        s += "ОК";
        System.out.println(s);
    }
}
