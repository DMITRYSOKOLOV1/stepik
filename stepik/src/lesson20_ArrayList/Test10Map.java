package lesson20_ArrayList;

import java.util.HashMap;
import java.util.Map;

public class Test10Map {
    public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<Integer, String>();
    map.put(1, "Andrey");
    map.put(2, "James");
    map.put(3, "John");
    map.put(4, "Mary");
    map.remove(1);
        System.out.println(map);
    }
}
