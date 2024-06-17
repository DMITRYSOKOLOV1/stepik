package lesson14_loopFor;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 0, j = 20; i < 50 && j < 30; i = i + 2, j++) {
            System.out.println("i " + i);
            System.out.println("j " + j);
        }
    }
}
