package lesson15_loopWhile;

public class Test2 {
    public static void main(String[] args) {
        int money = 100;
        while (money > 0) {
            System.out.println("play");
            System.out.println("you lose");
            money = money - 20;
        }
    }
}
