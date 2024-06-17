package lesson15_loopWhile;

public class Test9 {
    public static void main(String[] args) {
        OUTER:
        for (int chas = 0; chas < 24; chas++) {
            int min = 0;
            while (min < 60) {
                if (min == 20) {
                    continue OUTER;
                }
                System.out.println(chas + ":" + min);
                min++;
            }
        }
    }
}
