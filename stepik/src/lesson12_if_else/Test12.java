package lesson12_if_else;

public class Test12 {
    public static void main(String[] args) {
        int a = 30;
        int salary = 700;
        //if (salary >= 500) System.out.println("Agree");
        //else System.out.println("Canceled");

        if (salary < 200) {
            System.out.println("Salary is LESS");
        } else if (salary < 400) {
            System.out.println("Salary is OK");
        } else if (salary < 600) {
            System.out.println("Salary is GOOD");
        } else {System.out.println("Salary is VERY GOOD");
        }
    }
}
class Car {
    int engine;
    int doorCount;
    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}
class CarTest{
    public static void main(String[] args) {
        Car car = new Car(1, 6);
        Car car2 = new Car(2, 5);
        if (car.engine > car2.engine) {
            if (car.doorCount > car2.doorCount) {
                System.out.println("Engine1 and doorCount1 >");
            } else {
                System.out.println("Engine 1 > Engine 2, doorCount1 < doorCount2");
            }
        } else {
            System.out.println("Engine1 < Engine2");
        }
    }
}