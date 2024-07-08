package lesson22.p1;
import lesson22.Chelovek;
public class Test1 {
    public static void main(String[] args) {
        Chelovek chelovek = new Chelovek("female");
        chelovek.setName("Ira");
        chelovek.setAge(23);
        chelovek.setWeight(65.1);
        System.out.println(chelovek.getName());
        System.out.println(chelovek.getAge());
        System.out.println(chelovek.getWeight());
    }
}
