package top.mowangblog.code.string_;

/**
 * JavaStudy
 * StringExercise
 *
 * @author : Xuan Li
 * @date : 2021-09-04 21:09
 **/
@SuppressWarnings("all")//拦截所有警告
public class StringExercise01 {
    public static void main(String[] args) {
        String strA = "lixuan";
        String strB = new String("lixuan");
        System.out.println(strA.equals(strB));
        //equals方法重写比较值，T
        System.out.println(strA == strB);
        //==比较地址，strA直接创建指向常量池地址，strB new方法通过Value指向，地址不同，F
        System.out.println(strA == strB.intern());
        //intern返回字符串在常量池的地址，T
        System.out.println(strB == strB.intern());
        //intern返回字符串在常量池的地址，F
    }
}
