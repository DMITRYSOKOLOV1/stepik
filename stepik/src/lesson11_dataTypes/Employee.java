package lesson11_dataTypes;

public class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelich(double a) {
        a = a * 2;
        return a;
    }
    public double zp2() {
        salary = salary * 2;
        return salary;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 100.55);
        double result = emp1.uvelich(emp1.salary);
        System.out.println(result);
        emp1.zp2();
        System.out.println(emp1.salary);
    }
}
