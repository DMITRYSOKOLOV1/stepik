package lesson9;

public class Car {
    int $ = 5000;
    byte _cash = 50;
    String s = new String();
    String color;
    String engine;
    static int count;

    Car(String color,String engine){
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
}
