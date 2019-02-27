package chap04_quick_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 快速排序
 *
 * @author mzj
 * @since 1.0
 * 19-2-28
 */
public class QuickSort {
    public static void main(String[] args) {
        Integer[] arr = {2,8,5,7,6,9,3,10,1,4};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(quickSort(list));
    }

    private static List<Integer> quickSort(ArrayList<Integer> list) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();

        if (list.size() <= 1) {
            return list;
        }else{
            int pivot = list.remove(0);
            for(Integer item : list){
                if (item <= pivot){
                    less.add(item);
                }else {
                    greater.add(item);
                }
            }
            newList.addAll(quickSort(less));
            newList.add(pivot);
            newList.addAll(quickSort(greater));
            return newList;
        }
    }
}
