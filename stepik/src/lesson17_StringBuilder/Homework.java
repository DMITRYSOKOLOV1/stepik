package lesson17_StringBuilder;


public class Homework {
    public static boolean revenstvo(StringBuilder sb1, StringBuilder sb2){
        if(sb1.toString().equals(sb2.toString())){
            System.out.println("Равны");
            return true;
        } else {
            System.out.println("Не равны");
            return false;
        }
    }

    public static void main(String[] args) {
        if(revenstvo(new StringBuilder("Hello"), new StringBuilder("Hello"))){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
