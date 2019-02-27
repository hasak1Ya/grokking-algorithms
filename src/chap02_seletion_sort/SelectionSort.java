package chap02_seletion_sort;

/**
 * 选择排序
 *
 * @author mzj
 * @since 1.0
 * 19-2-27
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 10};
        selectionSort(arr);
        for (int item : arr) {
            System.out.print(item + "   ");
        }
    }

    private static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
