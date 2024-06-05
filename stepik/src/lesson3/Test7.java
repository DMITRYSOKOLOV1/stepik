package lesson3;

public class Test7 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;
        boolean z = true;

        boolean result = x && y && z;


        int a = 10;
        int b = 50;
        int c = 99;
        int d = 100;

        boolean b1 = a < b || ++c == d;

        System.out.println(b1);
        System.out.println(c);
        // System.out.println(result);

        boolean b2 = true, b3 = false, b4 = false, b5 = false;
        System.out.println(b2^b3^b4^b5); // только когда одна переменная true возвращает true


    }
}
