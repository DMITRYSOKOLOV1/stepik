package lesson11;

public class Student {
    public String name;
    public int cours;
    public double grade;
    public Student(String name, int cours, double grade) {
        this.name = name;
        this.cours = cours;
        this.grade = grade;
    }
    public static void swap (Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
        System.out.println(s2.name);
    }

    public static void changeName(Student s1){
        s1.name = "Petr";
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 10, 9.5);
        Student student2 = new Student("Kate", 1, 5.3);
        //Student student3 = new Student("Jack", 5, 8.1);

        swap(student1,student2);

        System.out.println(student1.name);
        System.out.println(student2.name);
        //System.out.println(student3.name);

        changeName(student2);
        System.out.println("метод changeName -" + student2.name);
    }
}
