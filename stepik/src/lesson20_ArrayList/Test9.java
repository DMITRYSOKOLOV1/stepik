package lesson20_ArrayList;

import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList ();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        for (Object o : al1){
            System.out.println("Number = " + o + " And lenth " + ((String)o).length());
        }
    }
}
