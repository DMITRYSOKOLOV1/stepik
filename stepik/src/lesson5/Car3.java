package lesson5;

public class Car3 {
    Car3(String cvet, String motor){
        color = cvet;
        engine = motor;    //Здесь определён конструктор класса Car3, который принимает два параметра типа String: cvet и motor. Когда создаётся новый объект класса Car3, конструктор инициализирует поля color и engine значениями, переданными в качестве аргументов.
    }
    String color;
    String engine;
}
class Car3Test {
    public static void main(String[] args) {
        //Car3 car3 = new Car3("red","v8");
        // System.out.println(car3.color);
        // System.out.println(car3.engine);
        // Car4 car4 = new Car4();
        //Car5 car5 = new Car5();
        //System.out.println(car5.color);
        //System.out.println(car5.engine);
        Car6 car6 = new Car6("black","v12");
        Car6 car6a = new Car6("pink","v9");
    }
}

class Car4 {
    Car4(){
        System.out.println("Object is created");
    }
}
class Car5 {
    Car5(){
        color = "blue";
        engine = "v2";
    }
    String color;
    String engine;
}
class Car6 {
    Car6(String cvet, String motor){
        color = cvet;
        engine = motor;
        System.out.println("Цвет у авто " + color + " двигатель - " + engine);
    }
    String color;
    String engine;
}
class Car7 {
    void Car7(String cvet, String motor){
        color = cvet;
        engine = motor;
        System.out.println("Цвет у авто " + color + " двигатель - " + engine);
    }
    String color;
    String engine;
}
