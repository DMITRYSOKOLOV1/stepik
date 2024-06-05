package lesson8;

public class Test1 {
    public final double pi;
    Test1(){
        pi = 3.14;
    }
    Test1(boolean b){
        pi = 3.0;
    }
    public void abc(short s){
        byte b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        // t.a = t.a*2;
        System.out.println(t.pi);
        t.abc((short) 4);
    }
}
