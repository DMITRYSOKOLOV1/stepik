package lesson22;

public class Chelovek {
    final String SEX;
    public Chelovek(String SEX){
        this.SEX = SEX;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 0 && age <= 100){
            this.age = age;
        }
    }
    private double weight;
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        if(weight > 30.0 && weight <= 150.0){
            this.weight = weight;
        }
    }
    private boolean smart;
    public boolean isSmarts(){
        return smart;
    }
    public void setSmarts(boolean smart) {
        this.smart = smart;
    }
    private StringBuilder prof;
    public StringBuilder getProf() {
        StringBuilder sb = new StringBuilder(prof);
        return sb;
    }
    public void setProf(StringBuilder prof) {
        this.prof = prof;
    }
}
class Test{
    public static void main(String[] args) {
        Chelovek ch = new Chelovek("Male");
        ch.setName("Ivan");
        ch.setWeight(70.3);
        ch.setAge(20);
        System.out.println(ch.getName());
        System.out.println(ch.getWeight());
        System.out.println(ch.getAge());

        ch.setProf(new StringBuilder("Santeknic"));
        ch.getProf().append("!");
        System.out.println("Профессия - " + ch.getProf());
    }
}
