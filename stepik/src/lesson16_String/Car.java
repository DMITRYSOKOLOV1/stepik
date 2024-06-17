package lesson16_String;

public class Car {
    String color;
    String engine;
    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    final static int a = 5;
    public Car abc(String color1){
        Car car = new Car(color1, "v4");
        return car;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "v6");
        Car c2 = c.abc("Black");
        System.out.println(c2.color);
    }


}
class TestCar{
    final static Car c = new Car("red", "v8");

    public static void main(String[] args) {
        c.color = "black";
        System.out.println(c.color);
    }
}
