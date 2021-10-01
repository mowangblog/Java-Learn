package top.mowangblog.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * JavaStudy
 * 正则表达式
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-10-01 09:10
 **/
public class RegExpDemo {
    public static void main(String[] args) {
        //分析java正则表达式的底层
        String content = "1998年12月8日，第二代Java平台的企业版J2EE发布。" +
                "1999年6月，Sun公司发布了第二代Java平台（简称为Java2）的3个版本：" +
                "J2ME（Java2 Micro Edition，Java2平台的微型版），应用于移动、无线及有限资源的环境；" +
                "J2SE（Java 2 Standard Edition，Java 2平台的标准版），应用于桌面环境；" +
                "J2EE（Java 2Enterprise Edition，Java 2平台的企业版），应用于3443基于Java的应用服务器。" +
                "Java 2平台的发布，是Java发展过程中最重要的一个里程碑，标志着Java的应用开始普及9889。";
        //加括号分组
        String regStr = "(\\d\\d)(\\d\\d)";
        //创建模式对象
        Pattern compile = Pattern.compile(regStr);
        //创建匹配器
        Matcher matcher = compile.matcher(content);
        //find()根据规则找到子字符串，将子字符串索引记录到matcher中group数组
        //group[0] = 记录下标开始的位置 group[1] = 记录下标结束的位置
        //同时oldLast记录下标结束的位置+1，下次再次匹配时从这里开始
        while (matcher.find()){
            /* group()方法源码
             * public String group(int group) {
             *         if (first < 0)
             *             throw new IllegalStateException("No match found");
             *         if (group < 0 || group > groupCount())
             *             throw new IndexOutOfBoundsException("No group " + group);
             *         if ((groups[group*2] == -1) || (groups[group*2+1] == -1))
             *             return null;
             *         return getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();
             *     }
             */
            //通过加括号分组
            //分组之后除了0记录整体子字符串之外,还会在后面按顺序记录子字符串分组的索引
            //但是不能越界
            System.out.println("matcher.group(0) = " + matcher.group(1)+" "+matcher.group(2));
        }

    }
}
