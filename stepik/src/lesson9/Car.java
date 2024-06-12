package lesson9;

public class Car {
    int $ = 5000;
    byte _cash = 50;
    String s = new String();
    String color;
    String engine;
    public static int count;

    public Car(String color,String engine){
        count ++; // this.count - тоже самое
        this.color = color;
        this.engine = engine;
    }

    public void showColor(){
        System.out.println("Цвет - " + color);
        //this.changeColor("red"); тоже самое что и без this.

    }
    public void changeColor(String color){
        System.out.println("Цвет изменился");
        int price = 30000;
        this.color = color;
        price += 10000;
    }
    void changeColor1(String color){
        System.out.println(color);
    }

    public static void main(String[] args) {
        Car car = new Car("red","v8");
        System.out.println(car.color);
        car.changeColor1("black");
        System.out.println(car.color);
    }
}
