package lesson6;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
        System.out.println("Data type is Int");
    }
    void show(int i1, int i2){
        System.out.println(i2);
        System.out.println("Data type is Int");
    }
    void show(boolean b1){
        System.out.println(b1);
    }
    void show(String s1){
        System.out.println(s1);
        System.out.println("Data type is String");
    }
    void show(String s, int a){
        System.out.println("String : " + s + " int :" + a);
    }
    void show(int a, String s){
        System.out.println("Hello world");
    }
}
class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s1 = "hello";
        mO.show(s1);
        mO.show(45,11);
        mO.show("Привет",11);
        mO.show(55,"F");
    }

}
