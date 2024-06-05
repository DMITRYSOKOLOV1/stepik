package lesson8;

public class Car {
    String color = "blue";
    String engine = "V8";
}
class Human {
    String name = "Ivan";
    final Car car = new Car();

    public static void main(String[] args) {
        Human human = new Human();
        // human.car = new Car();
        // human.car = new Car(); ошибка, не можем изменить адрес переменной т к final
        human.car.engine = "v12";
    }
}
