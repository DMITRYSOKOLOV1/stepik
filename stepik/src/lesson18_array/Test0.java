package lesson18_array;

public class Test0 {
    public static void main(String[] args) {
        // declaration
        int[] array1;
        String[] array2;
        double[][] array3;
        int[][] array4;
        // allocation
        array1 = new int[3];
        array2 = new String[3];
        array3 = new double[2][2];
        array4 = new int[3][];

        System.out.println(array1.length);
        //initialization
        // staticheskay
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        array2[0] = "Hello";
        array2[1] = "World";
        array2[2] = "Hi";

        array3[0][0] = 3.14;
        array3[0][1] = 4.56;

        double[] array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;

        array3[1] = array5;
        System.out.println(array3[1][1]);
    }
}
