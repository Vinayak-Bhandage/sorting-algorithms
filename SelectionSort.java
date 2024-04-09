import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] array) {
        int min;
        int temp;

        for (int i = 0; i < array.length-1; i++) {
            min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {
        int[] array = new int[]{16,26,28,5,8,46,38,26,39,40};
        selectionSort(array);
    }
}
