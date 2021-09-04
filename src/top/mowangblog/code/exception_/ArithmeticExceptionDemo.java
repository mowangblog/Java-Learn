package top.mowangblog.code.exception_;

/**
 * JavaStudy
 * runtimeException
 *
 * 算术异常
 *
 * @author : Xuan Li
 * @date : 2021-09-04 13:06
 **/
public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int n = 0;
            int m = 10;
            int result = m / n;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("继续运行");
    }
}
