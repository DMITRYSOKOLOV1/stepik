package lesson15_loopWhile;

public class Test6 {
    public static void main(String[] args) {
        int money = 100;
        do {
            System.out.println("play");
            System.out.println("lose, cash - " + money);
            money -= 10;
        } while (money > 30);
    }
}
