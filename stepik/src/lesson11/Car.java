package lesson11;

public class Car {
    String color;
    String engine;
    public int countDoor;
    public Car(String color, String engine, int countDoor) {
        this.color = color;
        this.engine = engine;
        this.countDoor = countDoor;
    }
}
class CarTest{
    public static void changeCountDoor(Car a, int b){
        a.countDoor = a.countDoor + b;
    }
    public static void changeValues(Car a1, Car a2){
        a1.color = a2.color;
        a1.engine = a2.engine;
    }

    public static void main(String[] args) {
        Car car = new Car("red","v6",2);
        Car car1 = new Car("black","s4",4);

        changeCountDoor(car,2);
        System.out.println(car.countDoor);

        changeValues(car,car1);
        System.out.println(car.color);
        System.out.println(car.engine);

    }
}
