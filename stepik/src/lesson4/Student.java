package lesson4;

public class Student {
    int studBilet;
    String firstname;
    String lastname;
    int yearOfStudy;
    double averageRatingMath;
    double averageRatingEconomic;
    double averageRatingForeignLanguage;

    void avg(){
        System.out.println("Средняя студента 1 " + (averageRatingEconomic
                + averageRatingMath + averageRatingForeignLanguage) / 3);
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.averageRatingEconomic = 3.4;
        student1.averageRatingMath = 4.4;
        student1.averageRatingForeignLanguage = 3.8;
        student1.avg();

        // System.out.println("Средняя студента 1 " + (student1.averageRatingEconomic
               /* + student1.averageRatingMath + student1.averageRatingForeignLanguage) / 3);

        student2.averageRatingEconomic = 4.1;
        student2.averageRatingMath = 3.7;
        student2.averageRatingForeignLanguage = 2.9;

        System.out.println("Средняя студента 2 " + (student2.averageRatingEconomic
                + student2.averageRatingMath + student2.averageRatingForeignLanguage) / 3);


        student3.averageRatingEconomic = 4.8;
        student3.averageRatingMath = 4.6;
        student3.averageRatingForeignLanguage = 3.2;

        System.out.println("Средняя студента 3 " + (student3.averageRatingEconomic
                + student3.averageRatingMath + student3.averageRatingForeignLanguage) / 3);
                */



    }
}
