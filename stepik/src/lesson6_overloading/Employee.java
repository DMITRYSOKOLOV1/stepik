package lesson6_overloading;

public class Employee {
    Employee(int id2,String surname2,int age2){
        id = id2;
		surname = surname2;
		age = age2;
    }
    public  Employee(String surname3, int age3){
        surname = surname3;
		age = age3;
    }
    Employee(int id4,String surname4,int age4,double salary4,String department4){
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }
    int id;
    public String surname;
    int age;
    double salary;
    String department;
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(1,"Ivanov",26);
        // System.out.println(emp.id);
        Employee emp2 = new Employee("Petrov",30);
        //System.out.println(emp2.surname);
        Employee emp3 = new Employee(2,"Sidorov",28,150000.00,"IT");
        System.out.println(emp3.salary);
    }
}
