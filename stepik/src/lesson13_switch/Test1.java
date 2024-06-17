package lesson13_switch;

public class Test1 {
}
class Student{
    int grade;
    Student(int grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student s1 = new Student(6);
        /*if(s1.grade == 2){
            System.out.println("very bad");
        } else if(s1.grade == 3){
            System.out.println("ok");
        } else if (s1.grade == 4){
            System.out.println("good");
        } else if(s1.grade == 5){
            System.out.println("very good");
        } else {
            System.out.println("ERROR");
        } */
        switch (s1.grade) {
            case 2:
                System.out.println("very bad");
                break;
            case 3:
                System.out.println("ok");
                break;
            case 4:
                System.out.println("good");
                break;
            case 5:
                System.out.println("very good");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
