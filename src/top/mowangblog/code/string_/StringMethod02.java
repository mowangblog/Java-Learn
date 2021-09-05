package top.mowangblog.code.string_;

/**
 * JavaStudy
 * method
 *
 * @author : Xuan Li
 * @date : 2021-09-05 00:15
 **/
@SuppressWarnings("all")
public class StringMethod02 {
    public static void main(String[] args) {
        //7.toUpperCase 转为字母大写
        String str1 = "lixuan";
        System.out.println(str1.toUpperCase());

        //8.toUpperCase 转为字母小写
        String str2 = "LIxuAN";
        System.out.println(str2.toLowerCase());

        //9.concat 拼接字符串
        String str3 = "Lixuan";
        String str4 = "mowang";
        System.out.println(str3.concat(str4).concat("nbnbnb"));

        //10.replace 替换字符串
        String str5 = "LixuanMowangLixuanMowang";
        System.out.println(str5.replace("Mowang", "Lixuan"));

        //11.split 分割字符串，返回字符串数组，某些字符串需要转移处理如| \\ 等
        String str6 = "Lixuan,Mowang,Lixuan,Mowang";
        String str7 = "Lixuan\\Mowang\\Lixuan\\Mowang";
        String[] split = str7.split("\\\\");
        for (String s : split) {
            System.out.println(s);
        }

        //12.toCharArray 转换为字符数组
        String str8 = "Lixuan";
        char[] chars = str8.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }

        //13.compareTo 前者大返回正数，后者大返回负数，相等返回0
        //前面字符相同，长度不同，长度相减
        String str9 = "Lixuan";
        String str10 = "mowang";
        System.out.println(str9.compareTo(str10));

        //14.format 模板输出，类似于printf
        String name = "lixuan";
        int age = 18;
        char gender = '男';
        double salay = 22000.520f;
        String formatStr = "我是%s 性别%c 年龄是%d 月薪是%.2f";
        System.out.println(String.format(formatStr,name,gender,age,salay));

    }
}
