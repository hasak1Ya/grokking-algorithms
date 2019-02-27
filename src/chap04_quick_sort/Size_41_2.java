package chap04_quick_sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 求元素个数
 *
 * @author mzj
 * @since 1.0
 * 19-2-28
 */
public class Size_41_2 {
    public static void main(String[] args) {
        Integer[] arr = {2,8,5,7,6,9,3,10,1,4};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(size(list));
    }

    private static int size(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            list.remove(0);
            return 1 + size(list);
        }
    }
}
