package lesson12;

public class Car2 {
    String color;
    String engine;
    Car2(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
}
class Car2Test{
    public static void main(String[] args) {
        Car2 car = new Car2("red", "v6");
        Car2 car1 = new Car2("red", "v6");
        if (car == car1){ // это мы сравниваем адреса двух объектов!! false потому что адреса разные
            System.out.println("в скобках true");
        } else {
            System.out.println("в скобках false");
        }

        String s1 = new String("ABC");
        String s2 = new String("ABC");

        // s1 == s2 - false
        if (s1.equals(s2)){
            System.out.println("условие TRUE");
        } else {System.out.println("условие FALSE");}
    }
}
