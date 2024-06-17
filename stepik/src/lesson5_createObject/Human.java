package lesson5_createObject;

public class Human {
    String name;
    Car8 car8;
    BankAccount2 bankAccount2;

    void info(){
        System.out.println("Имя - "+ name + " цвет авто - " + car8.color + " Баланс - " + bankAccount2.balance);
    }
}
class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Dave";
        human.car8 = new Car8("black", "v14");
        human.bankAccount2 = new BankAccount2(124,1000.22);
        human.info();
    }
}

class Car8{
    Car8(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    String color;
    String engine;
}
class BankAccount2{
    BankAccount2(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    int id;
    double balance;
}
