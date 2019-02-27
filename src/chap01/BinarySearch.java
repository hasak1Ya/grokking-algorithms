package chap01;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(myList, 3));
        System.out.println(binarySearch(myList, -1));
    }

    private static int binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (list[mid] == item) {
                return mid;
            } else if (list[mid] < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}