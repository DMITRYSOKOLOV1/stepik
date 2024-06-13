package lesson14;

public class Test6 {
    public static void time(){
        OUTER:for(int chas = 0; chas <=23; chas++){
            System.out.println("start outer loop");
            for(int min = 0; min <= 59; min++){//nested loop
                if (min == 5){
                    continue OUTER;
                }
                System.out.println(chas + ":" + min);
                if(min == 10){
                    break;
                }
            }
            System.out.println("finish outer loop");
        }
    }

    public static void main(String[] args) {
        time();
    }
}
