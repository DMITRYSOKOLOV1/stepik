package lesson18_array;

public class Test6 {
    public static void maxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    public static void main(String[] args) {
        int[] array = {1, 2, -2, 3, 0, 7, 6, 6, 4, 1, 3, 7, 9};
        maxMin(array);
        maxMin(new int[] {1,4,6,-9});
    }
}
