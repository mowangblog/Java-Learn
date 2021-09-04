package top.mowangblog.code.exception_;

/**
 * JavaStudy
 * arrayIndexOutOfBoundsException runtimeException
 *
 * 数组下标越界异常
 *
 * @author : Xuan Li
 * @date : 2021-09-04 13:09
 **/
public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int anInt = array[5];
    }
}
