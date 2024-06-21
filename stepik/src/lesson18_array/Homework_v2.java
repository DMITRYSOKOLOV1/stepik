package lesson18_array;

public class Homework_v2 {
    public static int[] sortirovka(int[] array){
        int a;
        for(int i=0;i<array.length;i++){
            int min = array[i];
            int index = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<min){
                    min = array[j];
                    index = j;
                }
            }
            if(index!=i){
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        } return array;
    }
    public static void main(String[] args) {
        int[] array = {1,-7,3,44,12,6,2,-8,0};
        sortirovka(array);
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
