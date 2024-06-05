package lesson5;

public class Car2 {
    Car2(){

    }
    String color;
    String engine;
    int speed;

    void gaz(int skorost){
        speed += skorost;
    }
    void tormoz(int skorost){
        speed -= skorost;
    }

    void showInfo(){
        System.out.println("cvet: " + color + " motor: " + engine + " skorost: " + speed);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.engine = "v6";
        c1.speed = 60;

        c1.showInfo();
        c1.gaz(40);
        c1.showInfo();
        c1.tormoz(100);
        c1.showInfo();

    }
}
