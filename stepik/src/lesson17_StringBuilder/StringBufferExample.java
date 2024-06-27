package lesson17_StringBuilder;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // "Hello World"

        sb.insert(5, " Java");
        System.out.println(sb); // "Hello Java World"

        sb.replace(6, 10, "Buffer");
        System.out.println(sb); // "Hello Buffer World"

        sb.delete(6, 12);
        System.out.println(sb); // "Hello World"

        sb.reverse();
        System.out.println(sb); // "dlroW olleH"
    }
}
