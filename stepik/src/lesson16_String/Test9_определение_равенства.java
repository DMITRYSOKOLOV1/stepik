package lesson16_String;

public class Test9_определение_равенства {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
       //System.out.println(s1 == s2);
        //System.out.println(s1.equals(s2));

        String s3 = "Privet";
        String s4 = "Privet";
        //System.out.println(s3 == s4);
        //System.out.println(s3.equals(s4));

        String s5 = "JaVa";
        String s6 = "jAvA";

        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
        System.out.println(s5.equalsIgnoreCase(s6));
    }
}
