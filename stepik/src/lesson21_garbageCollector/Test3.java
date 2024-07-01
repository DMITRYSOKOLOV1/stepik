package lesson21_garbageCollector;

public class Test3 {
    Test3(){
        System.out.println("Konstruktor");
    }
    void Test3(){
        System.out.println("Objeck created");
    }
    int Test3 = 5;
}
class A{
    public static void main(String[] args) {
        Test3 t1 = new Test3();
    }
}
