package lesson20_ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Homework {
    public ArrayList<String> abc(String... s){
        ArrayList <String> aL = new ArrayList<>();
        for (String s1 : s){
            if(!aL.contains(s1)){
                aL.add(s1);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }
    public static void main(String[] args) {
        Homework h = new Homework();
        h.abc("Hello", "World","privet","ok","Hello","poka","World");
    }
}


