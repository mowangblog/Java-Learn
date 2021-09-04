package top.mowangblog.code.exception_;

/**
 * JavaStudy
 * runtimeException
 *
 * 数字格式不正确异常
 *
 * @author : Xuan Li
 * @date : 2021-09-04 13:20
 **/
public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        //数字格式正确
        String str= "111";
        System.out.println(Integer.parseInt(str));

        //数字格式不正确异常
        String str1 = "LiXuan";
        System.out.println(Integer.parseInt(str1));

    }
}
