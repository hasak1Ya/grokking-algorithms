package chap04_quick_sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 求和
 *
 * @author mzj
 * @since 1.0
 * 19-2-28
 */
public class Sum_41_1 {
    public static void main(String[] args) {
        Integer[] arr = {2,8,5,7,6,9,3,10,1,4};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(sum(list));
    }

    private static int sum(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return 0;
        } else {
            return list.remove(0) + sum(list);
        }
    }
}
