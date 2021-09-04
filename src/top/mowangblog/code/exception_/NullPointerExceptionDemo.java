package top.mowangblog.code.exception_;

/**
 * JavaStudy
 * runtimeException
 * <p>
 * 空指针异常演示和try catch处理
 *
 * @author : Xuan Li
 * @date : 2021-09-04 12:59
 **/
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            NullPointerExceptionDemo nullPointerException = null;
            nullPointerException.test();
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("继续运行");
        NullPointerExceptionDemo nullPointerException1 = null;
        nullPointerException1.test();
        System.out.println("未处理无法继续运行");
    }

    public void test() {
    }
}
