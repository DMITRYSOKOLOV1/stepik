package lesson7;

public class Employee {
    public double salary;
    private double salary2;
    private void zpX2_2(){
        System.out.println("New zp = " + salary2*2);
    }
    private Employee(double salary,double salary2){
        this.salary = salary;
        this.salary2 = salary2;
    }

    public void zpX2(){
        System.out.println("New zp = " + salary*2);
    }
    public Employee(double salary){
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(400.00);
        System.out.println(employee.salary);
        employee.zpX2();
        Employee employee1 = new Employee(300,500.5);
        System.out.println(employee1.salary2);
        employee1.zpX2_2();
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee employee = new Employee(400.00);
        System.out.println(employee.salary);
        employee.zpX2();
    }
}
