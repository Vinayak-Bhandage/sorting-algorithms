import java.util.Arrays;

public class InsertionSort {

    //Step1: Start loop from i = 1 to n-1
    //Step2: Set key = a[i]
    //Step3: Compare key with all the elements of sorted array using another loop
    //Step4: if the key is smaller than any element of the sorted array shift all the elements of the sorted array
    //Step5: End inner loop
    //Step5: Place key at its correct position
    //Step7: End outer loop

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
