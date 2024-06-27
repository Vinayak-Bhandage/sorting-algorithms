import java.util.Arrays;

public class SelectionSort {

/*    1. Set MIN to location 0.
      2. Search the minimum element in the list.
      3. Swap with value at location MIN.
      4. Increment MIN to point to next element.
      5. Repeat until the list is sorted.
*/

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
