package lesson7;

public class DZ {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void pokazID(int id){
        System.out.println(id);
    }

    public void pokazSurname(String surname){
        System.out.println(surname);
    }
    public void pokazSalary(double salary){
        System.out.println(salary);
    }

    public DZ (int id){
        this.id = id;
    }
    DZ (int id, String surname){
        this.id = id;
        this.surname = surname;
    }
    private DZ (int id, String surname,double salary){
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }
}

class DZTEST{
    public static void main(String[] args) {
        DZ dz = new DZ(1,"Inar");
    }
}
