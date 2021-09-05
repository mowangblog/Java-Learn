package top.mowangblog.code.wrapper_;

/**
 * JavaStudy
 * demo
 *
 * @author : Xuan Li
 * @date : 2021-09-04 19:55
 **/
@SuppressWarnings("all")
public class WrapperDemo2 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
        //不同的对象比较地址，返回False

        //自动装箱的底层实际调用的还是Integer.valueOf()
        //通过看源码可知 IntegerCache.low = -128 && IntegerCache.high = 127
        /*   Integer.valueOf() 方法源码
             if (i >= IntegerCache.low && i <= IntegerCache.high)
                    return IntegerCache.cache[i + (-IntegerCache.low)];
                return new Integer(i);
         */
        Integer n = 1;
        //1在i >= IntegerCache.low && i <= IntegerCache.high
        Integer m = 1;
        //因此范围之内直接从缓存数组返回 IntegerCache.cache[i + (-IntegerCache.low)];不建立新对象
        System.out.println(n == m);
        //不建立新对象所以是同一个对象返回True

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
        //同理调用Integer.valueOf()，超出范围，创建新对象，返回False

        Integer n1 = 127;
        int n2 = 127;
        //Integer和int比较会自动拆箱，基本数据类型==比较的是值
        System.out.println(n1 == n2);
        //127 == 127 True

        Integer n4 = 128;
        int n3 = 128;
        //Integer和int比较会自动拆箱，基本数据类型==比较的是值
        System.out.println(n1 == n2);
        //128 == 128 True
    }

}
