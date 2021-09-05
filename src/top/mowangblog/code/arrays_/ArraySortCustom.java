package top.mowangblog.code.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * JavaStudy
 * exercise
 *
 * 自定义排序
 *
 * @author : Xuan Li
 * @date : 2021-09-05 17:05
 **/
@SuppressWarnings("all")
public class ArraySortCustom {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 543, 3, 43, 23, 5, 32};
        ArraySortCustom.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer)o2 - (Integer)o1;
            }
        });

        System.out.println("自定义排序后 arr = " + Arrays.toString(arr));
    }

    public static void sort(Integer[] arr, Comparator comparator) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
