package lesson7;

public class Employee2 {
    public static void main(String[] args) {
        Employee employee = new Employee(400.00);
        System.out.println(employee.salary);
        employee.zpX2();

        /*
        Employee employee1 = new Employee(300,500.5);
        System.out.println(employee1.salary2);   здесь не видны т к приватный
        employee1.zpX2_2();
        */
    }
}
