package lesson6;

public class Stud {
    Stud(int studBilet,String firstname,String lastname,int yearOfStudy,double averageRatingMath,double averageRatingEconomic,double averageRatingForeignLanguage)
    {
        this.studBilet = studBilet;
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfStudy = yearOfStudy;
        this.averageRatingMath = averageRatingMath;
        this.averageRatingEconomic = averageRatingEconomic;
        this.averageRatingForeignLanguage = averageRatingForeignLanguage;
    }
    Stud(int studBilet,String firstname,String lastname,int yearOfStudy){
        this(studBilet,firstname,lastname,yearOfStudy,0.0,0.0,0.0);
    }
    Stud(){
        this(0,null,null,0,0.0,0.0,0.0);
    }
    int studBilet;
    String firstname;
    String lastname;
    int yearOfStudy;
    double averageRatingMath;
    double averageRatingEconomic;
    double averageRatingForeignLanguage;
}
class StudTest{
    public static void main(String[] args) {
        Stud stud1 = new Stud();
        Stud stud2 = new Stud(1,"Di","RO",3,4.0,4.3,5.0);
        Stud stud3 = new Stud(2,"A","B",5);
        System.out.println(stud3.yearOfStudy);
        System.out.println(stud3.averageRatingEconomic);
        System.out.println(stud2.firstname);
    }
}
