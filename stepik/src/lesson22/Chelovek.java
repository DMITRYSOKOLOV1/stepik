package lesson22;

public class Chelovek {
    final String SEX;
    Chelovek(String SEX){
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
}
class Test{
    public static void main(String[] args) {
        Chelovek ch = new Chelovek("Male");
        ch.setName("Ivan");
        System.out.println(ch.getName());
        ch.setAge(120);
        System.out.println(ch.getAge());
    }
}
