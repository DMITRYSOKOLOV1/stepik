package lesson4_class_object;

public class Test10 {
    void max(int a, int b, int c){
        if (a > b && a > c){
            System.out.println("max - " + a);
        } else if (b > a && b > c){
            System.out.println("max - " + b);
        } else {
            System.out.println("max - " + c);
        }
    }
    public static void main(String[] args) {
        Test10 t = new Test10();
        t.max(3, 4, 1);
    }
}