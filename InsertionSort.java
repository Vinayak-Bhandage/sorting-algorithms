import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] array) {
        int temp;

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        insertionSort(arr);
    }
}
