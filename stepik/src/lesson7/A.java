package lesson7;
import lesson6.Employee;

public class A {
    public static void main(String[] args) {
        B object = new B();
        // Employee obj = new Employee();  - ошибка в разных пакетах
        lesson6.Employee object1 = new lesson6.Employee("Bob",41);
        String s = object1.surname;
        System.out.println(s);
    }
}
