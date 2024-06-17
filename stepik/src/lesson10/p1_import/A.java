package lesson10.p1_import;
//import lesson10.p2.*;
//import lesson10.p2.p3.*; /* без вот этого класс C не импортнется */
import static lesson9_variableVisibility.Car.count;
import java.lang.*; // импортируется всегда, можно не писать
// import lesson8.*;

public class A {
    public static void main(String[] args) {
        //B b1 = new B();
        C c1 = new C("Dima");
        // lesson9.Car car = new lesson9.Car("red","v3"); - до импорта
        System.out.println(count);
        //Student student = new Student("Ivan",3);
        //System.out.println(student.a);
        //System.out.println(Student.countStudent);
        C c2 = new C("Op");
        C c3 = new C("Opa");
        C c4 = new C("Ivan");
        System.out.println(count);
    }
}
class C{
    String name;
    public C(String name) {
        this.name = name;
        count++;

    }
}