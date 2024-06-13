package lesson15;

public class Test10DZ {
    public static void main(String[] args) {
        int chas = 0;
        OUTER1:while (chas < 6){
            int min = -1;
            MIDDLE:do {
                min++;
                int sec = 0;
                if(chas > 3){
                    break OUTER1;
                }
                while (sec < 60) {
                    if(sec * chas > min){
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + min + ":" + sec);
                    sec++;
                }
            } while (min <= 59);
            chas++;
        }
    }
}
