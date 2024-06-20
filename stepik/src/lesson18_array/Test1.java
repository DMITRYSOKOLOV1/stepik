package lesson18_array;

public class Test1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        String[] array2 = {"A", "B", "C", "D", "E"};
        Car[] array3 = {new Car("Ford"), new Car("Pegoet"), new Car("Renault")};
        int[][] array4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(array3[1].marka);
        System.out.println(array2[0]);
        System.out.println(array4[0][2]);
        array1[4] = 10;
        System.out.println(array1[4]);

        char[][][] array5 = {{{'a','b'},{'c','d'},{'e','f'}},{{'g','h'},{'i','j'},{'k','l'}}};
        System.out.println(array5[1][1][1]);
    }
}

class Car{
    String marka;
    Car(String marka){
        this.marka = marka;
    }
}
