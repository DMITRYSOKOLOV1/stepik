package lesson8;

public class Dz {
    static double umnojenie(double a,double b,double c){
        double result = a * b * c;
        System.out.println(result);
        return result;
    }
    static void show(double e, double f){
        System.out.println(e / f);
    }
}
class DzTest{
    public static void main(String[] args) {
        Dz dz = new Dz();
        Dz.umnojenie(2.2,3.3,4.4);
        Dz.show(5.1,2.4);

    }
}



