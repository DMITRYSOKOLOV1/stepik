package lesson7_package;

public class A {
    public static void main(String[] args) {
        B object = new B();
        // Employee obj = new Employee();  - ошибка в разных пакетах
        lesson6_overloading.Employee object1 = new lesson6_overloading.Employee("Bob",41);
        String s = object1.surname;
        System.out.println(s);
    }
}
