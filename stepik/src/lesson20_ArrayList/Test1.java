package lesson20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("Hello");
        Car car = new Car();
        list.add(car);
        Student student = new Student();
        list.add(student);
        list.add(new StringBuilder("OK"));

        ArrayList <String> list2 = new ArrayList<>(8);
        ArrayList <String> list4 = new ArrayList<>(list2);
        list2.add("Hello");

        List <StringBuilder> list3 = new ArrayList<>();
        list3.add(new StringBuilder("OKEY"));
    }
}


class Car{}
class Student{}