package lesson6_overloading;

public class Homework {
    int sum(){
        int result = 0;
        return result;
    }
    int sum(int a){
        int result = a;
        return result;
    }
    int sum(int a,int b){
        int result = a+b;
        return result;
    }
    int sum(int a, int b,int c){
        int result = a+b+c;
        return result;
    }
    int sum(int a, int b,int c,int d){
        int result = a+b+c+d;
        return result;
    }
}
class HomeworkTest{
    public static void main(String[] args) {
        Homework h1 = new Homework();
        System.out.println(h1.sum());
        System.out.println(h1.sum(1));
        System.out.println(h1.sum(1 ,2));
        System.out.println(h1.sum(1,2,3));
        System.out.println(h1.sum(1,2,3,4));
    }
}

