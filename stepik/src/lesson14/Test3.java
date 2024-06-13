package lesson14;

public class Test3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 25; i = i + 5) { // update statement можно написать и в теле цикла
            System.out.println("i - " + i);
            abc(9);
            // i = i + 5;
        }
    }
    static void abc(int n){
        System.out.println("n - " + n);
    }
}
