package top.mowangblog.code.wrapper_;

/**
 * JavaStudy
 * demo
 * <p>
 * 非常经典的面试题
 *
 * @author : Xuan Li
 * @date : 2021-09-04 19:55
 **/
@SuppressWarnings("all")
public class WrapperDemo {
    public static void main(String[] args) {
        Object obj = true ? new Integer(1) : new Double(11.0);
        Object obj2;
        if (true) {
            obj2 = new Integer(1);
        } else {
            obj2 = new Double(2.0);
        }
        System.out.println(obj); //三元运算符是一个整体会提升精度，输出1.0
        System.out.println(obj2); //if语句独立赋值，输出1

    }

}
