package lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;
    Employee(int id,String surname,int age,double salary,String department){
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double xSalery() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Petr", 33, 44000.5, "First");
        Employee employee2 = new Employee(2, "Vasya", 23, 34000.5, "Double");

        employee1.xSalery();
        System.out.println(employee1.salary);


    }


}
