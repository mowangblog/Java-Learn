package top.mowangblog.code.arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * JavaStudy
 * arrays method
 *
 * @author : Xuan Li
 * @date : 2021-09-05 16:31
 **/
public class ArraysMethod02 {
    public static void main(String[] args) {
        //binarySearch 二分查找，要求数组有序，如果不存在返回-(low + 1) -本该在的位置+1
        Integer[] arr = {1, 3, 543, 3, 43, 23, 5, 32};
        Arrays.sort(arr);
        System.out.println("Arrays.binarySearch(arr,543) = " + Arrays.binarySearch(arr, 545));

        //copyOf 拷贝 arr.length/2 个数组到新数组 大于原长度在后面增加null,负数抛出异常
        Integer[] integers = Arrays.copyOf(arr, arr.length / 2);
        System.out.println("Arrays.toString(integers) = " + Arrays.toString(integers));

        //fill 数组元素填充
        Integer[] arr1 = {1, 3, 32};
        Arrays.fill(arr1,99);
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        //equals 比较数组元素是否完全一致
        Integer[] arr2 = {1, 3, 32};
        System.out.println("Arrays.equals(arr1,arr2) = " + Arrays.equals(arr1, arr2));

        //asList 将数组数据转为List集合
        List<Integer> integerList = Arrays.asList(arr2);
        System.out.println(integerList);

    }
}
