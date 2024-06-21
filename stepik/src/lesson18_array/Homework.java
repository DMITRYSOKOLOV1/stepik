package lesson18_array;

import java.util.Arrays;


public class Homework {
    public static void sortirovka(int[] array){
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int[] array = {3,1,5,-7};
        sortirovka(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
