package lesson12_if_else;
import lesson11_dataTypes.Student;
//import org.jetbrains.annotations.NotNull;

public class StudentTest {
    void sravnenie(Student s1,Student s2) {
        if(s1.name.equals(s2.name) && s1.cours == s2.cours && s1.grade == s2.grade){
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }
    }
    void sravnenie2(Student s1,Student s2) {
        if(s1.name.equals(s2.name)){
            if(s1.grade == s2.grade){
                if (s1.cours == s2.cours){
                    System.out.println("равны");
                } else {
                    System.out.println("course не равны");
                }
            } else {
                System.out.println("grade не равны");
            }
        } else {
            System.out.println("name не равны");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Dima",0,0);
        Student s2 = new Student("Dima",1,0);
        Student s3 = new Student("Petr",2,6.1);
        Student s4 = new Student("Petr",2,6.1);

        StudentTest studentTest = new StudentTest();
        studentTest.sravnenie(s1,s2);
        studentTest.sravnenie2(s3,s4);

    }
}
