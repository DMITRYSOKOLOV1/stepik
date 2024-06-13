package lesson14;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            if(i == 4){
                break;
            }
            System.out.println(i);
        }
        for (int j = 1; j <= 5; j++){
            if(j == 2 || j == 3){
                continue;
            }
            System.out.println("j - " + j);
        }

        for(int k = 0; k <=20; k++){
            if(k == 5){
                continue;
            }
            if(k == 12){
                break;
            }
            System.out.println("k " + k);
        }
    }
}
