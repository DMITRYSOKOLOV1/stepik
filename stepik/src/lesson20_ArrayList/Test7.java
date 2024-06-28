package lesson20_ArrayList;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,2,3,4};

        char [] array3 = {'p','r','i','v','e','t'};
        char [] array4 = {'p','r','i','v','i','v','k','a'};

        System.out.println(Arrays.compare(array4,array3));//когда одинаковы 0, когда 1 < 2 меньше 0
        System.out.println(Arrays.mismatch(array1,array2)); // индекс элемента первого расхождения
    }
}
