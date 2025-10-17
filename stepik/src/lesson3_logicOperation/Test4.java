package lesson3_logicOperation;

public class Test4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = a + b;
        int d = b - a;
        int e = b * a;
        int f = b / a;

        int a1 = 10;
        int b1 = 3;
        int f1 = a1 / b1;

        double a2 = 11;
        double b2 = b1;
        double f2 = a2/b2;

        int celayChast = a1/b1;
        int ostatok = a1 % b1;

        int a3 = a++;

        System.out.println(celayChast);
        System.out.println(ostatok);
        System.out.println(a3);

        int x = 5;
        int y = 3;
        int z = x - y++;
        System.out.println(z);
        System.out.println(y);

    }
}
