package lesson8;

public class TestPi {
    static final double Pi = 3.14;
    double ploshadKruga(double r){
        double result = Pi * r * r;
        return result;
    }
    static double dlinaOkrujnosti(double r2){
        double result = 2 * Pi * r2;
        return result;
    }
    void showInfo(double r3) {
        System.out.println("Radius - " + r3);
        System.out.println("S - " + ploshadKruga(r3));
        System.out.println("Dlina - " + dlinaOkrujnosti(r3));
    }
}

class Test{
    public static void main(String[] args) {
        TestPi a = new TestPi();
        System.out.println(a.ploshadKruga(5.3));
        System.out.println(TestPi.dlinaOkrujnosti(6.1));
        a.showInfo(3.1);
    }
}

