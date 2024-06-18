package lesson16_String;

public class Homework {
    /*public static void email(String email) {
        if (email.contains("@gmail.com")) {
            System.out.println("gmail");
        } else if(email.contains("@yahoo.com")){
            System.out.println("yahoo");
        } else if(email.contains("@mail.com")){
            System.out.println("mail");
        } else {
            System.out.println("not a valid email");
        }
    }

    public static void main(String[] args) {
        email("ona@gmail.com");
        email("ya@yahoo.com");
        email("on@mail.com");
        email("irina@mail.com");
        email("Sok@gmail.com");
        email("Sok@dima.com");
    } */
    public void email(String s){
        int a = 0; // @
        int b = 0; // .
        int c = 0; // ;
        while (c < s.length() - 1){
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }
    public static void main(String[] args) {
        String s1 = "ya@yahoo.com; on@gmail.com; ona@mail.com;";
        System.out.println(s1.length());
        Homework work = new Homework();
        work.email(s1);
    }
}
