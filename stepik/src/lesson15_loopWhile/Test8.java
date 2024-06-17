package lesson15_loopWhile;

public class Test8 {
    public static void main(String[] args) {
        int chas = -1;

        OUTER:
        do {
            chas++;
            int min = 0;

            while (min < 60) {
                if (min == 20) {
                    break OUTER;
                }
                System.out.println(chas + ":" + min);
                min++;
            }
        } while (chas < 24);
    }
}
