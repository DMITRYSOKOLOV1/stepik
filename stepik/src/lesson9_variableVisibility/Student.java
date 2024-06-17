package lesson9_variableVisibility;

public class Student {
    String name = "Ivan";

}

class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3;
        String s = " Привет";
        System.out.println(student2.name + s);
    }
}