package lesson5_createObject;

public class Test20 {
    int summa(int a,int b,int c){
        int result = a + b + c;
        return result;
    }
    int sredneeArifm(int a1,int b1, int c1){
        int result2 = summa(a1,b1,c1)/3;
        return result2;
    }
}
class Test21{
    public static void main(String[] args) {
        Test20 t = new Test20();
        int sum = t.summa(2,3,5);
        System.out.println(sum);
        System.out.println(t.sredneeArifm(20,40,60));
    }
}
