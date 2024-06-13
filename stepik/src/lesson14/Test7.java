package lesson14;

public class Test7 {
    public static void time() {
        OUTER1:
        for (int chas = 0; chas <= 5; chas++) {
            for (int min = 0; min <= 59; min++) {
                if (chas > 1 && min % 10 == 0) {
                    break OUTER1;
                }
                for (int sec = 0; sec <= 59; sec++) {
                    if (sec * chas > min) {
                        continue;
                    }
                    System.out.println(chas + ":" + min + ":" + sec);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
