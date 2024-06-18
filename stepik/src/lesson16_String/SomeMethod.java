package lesson16_String;

public class SomeMethod {

    public static void main(String[] args) {
        String s1 = "privet";
        String s2 = "   ";
        System.out.println(s1.isBlank()); // true если есть tab или пробел
        System.out.println(s2.isBlank());

        // isEmpty - true когда пустой String
        String s3 = " ";
        String s4 = "";
        System.out.println(s3.isEmpty());
        System.out.println(s4.isEmpty());
        String s5 = "  privet   ";
        System.out.println(s5.strip()); // удалить пробелы в начала и конце
        String s6 = s5.stripLeading();
    }
}
