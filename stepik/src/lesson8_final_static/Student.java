package lesson8_final_static;

public class Student {
    String name;
    int course;
    public static int countStudent;
    public int a;

    public Student(String name,int course){
        countStudent++;
        this.name = name;
        this.course = course;
        System.out.println("Student № " + countStudent + " created");
    }
    public static void showCountStudent (){
        System.out.println("created " + countStudent + " student");
    }
    public void showInfo(){
        System.out.println("Welcome to Stud Class");
    }
    void abc(){
        a++;
    }
    static void abcd(){
        countStudent++;
        // a++; - ошибка нельзя не статичную переменную в статичном методе
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student("Ivan",1);
        Student student2 = new Student("Petr",4);
        Student student3 = new Student("Masha",2);
        System.out.println(Student.countStudent);
        System.out.println(student2.course);
        Student.showCountStudent();
        student1.a = 9;
        student1.abc();
        System.out.println(student1.a);
    }
}
