package chap04_quick_sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 求最大值
 *
 * @author mzj
 * @since 1.0
 * 19-2-28
 */
public class Max_41_3 {
    public static void main(String[] args) {
        Integer[] arr = {2,8,5,7,6,9,3,10,1,4};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(max(list));
    }

    private static int max(ArrayList<Integer> list) {
        if (list.size() == 2) {
            return list.get(0) > list.get(1) ? list.get(0) : list.get(1);
        } else {
            int max = list.remove(0);
            int subMax = max(list);
            return max > subMax ? max : subMax;
        }
    }
}
