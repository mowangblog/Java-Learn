package top.mowangblog.code.string_;

/**
 * JavaStudy
 * method
 *
 * @author : Xuan Li
 * @date : 2021-09-05 00:15
 **/
@SuppressWarnings("all")
public class StringMethod01 {
    public static void main(String[] args) {
        //1.equals
        String str1 = "lixuan";
        String str2 = "lixuan";
        System.out.println(str1.equals(str2));

        //2.equalsIgnoreCase 忽略大小写比较
        String str3 = "Lixuan";
        String str4 = "liXuan";
        System.out.println(str3.equalsIgnoreCase(str4));

        //3.length 字符串长度
        System.out.println(str4.length());

        //4.indexOf //获取字符第一次出现的位置下标，没有返回-1
        String str5 = "lixuan";
        System.out.println(str5.indexOf("x"));
        System.out.println(str5.indexOf("an"));

        //5.lastIndexOf //获取字符第一次出现的位置下标，没有返回-1
        String str6 = "lixuanlixuanlixuan";
        System.out.println(str6.lastIndexOf("x"));

        //6.substring 截取指定范围的子串
        String str7 = "lixuanlixuanlixuan";
        System.out.println(str7.substring(0,10));//从零开始截取到10-1的位置
        System.out.println(str7.substring(5));//从索引5以后开始截取
    }
}
