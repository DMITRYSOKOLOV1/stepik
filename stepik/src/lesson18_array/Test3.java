package lesson18_array;

public class Test3 {
    static String s;
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        //array[3] = 4;  .Array Index Out Of Bounds Exception

        int[][] array2 = new int[3][];
        // System.out.println(array2[0][1]); NullPointerException
        // System.out.println(s.length()); NullPointerException

    }
}
