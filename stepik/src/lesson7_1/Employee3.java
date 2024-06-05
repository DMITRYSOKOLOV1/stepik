package lesson7_1;
import lesson7.Employee;

public class Employee3 {
    int age = 41;
    public static void main(String[] args) {
        Employee employee = new Employee(400.00);
        System.out.println(employee.salary);
        employee.zpX2();

        /*
        Employee employee1 = new Employee(300,500.5);
        System.out.println(employee1.salary2); здесь не видны т к приватный
        employee1.zpX2_2();
         */
    }
}
class Experiment{
    public static void main(String[] args) {
        Employee3 employee3 = new Employee3();
        System.out.println(employee3.age);
    }
}
