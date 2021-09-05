package top.mowangblog.code.arrays_;

import java.util.*;

/**
 * JavaStudy
 * arrays method
 *
 * @author : Xuan Li
 * @date : 2021-09-05 16:31
 **/
public class ArraysMethod01 {
    public static void main(String[] args) {
        //Arrays.toString 遍历数组
        Integer[] arr = {1, 3, 543, 3, 43, 23, 5, 32};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        Comparator<Integer> comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer) o2 - (Integer) o1;
            }
        };
        //因为数组是引用类型因此排序后会直接影响到arr
        Arrays.sort(arr, comparator);

        System.out.println("Arrays.sort 后 arr = " + Arrays.toString(arr));
    }
}
