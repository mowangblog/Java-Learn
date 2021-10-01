package top.mowangblog.regexp.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * JavaStudy
 * 正则表达式反向引用
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-10-01 17:13
 **/
public class RegExpExercise6 {
    public static void main(String[] args) {
        String content = "2000年5月，JDK1.3、JDK1.4和J2SE1.3" +
                "相继发布，几周后其获得了Apple公司Mac OS X的工业标准的支持。";
        //把jdk1.3 jdk.14替换成jdk1.8
        System.out.println(content.replaceAll("JDK1.3|JDK1.4", "JDK1.8"));

        content = "17674090625";
        //判断手机号是否是以176 156 172开头
        if (content.matches("1(76|72|56)\\d{8}")) {
            System.out.println("符合要求");
        }else {
            System.out.println("不符合要求");
        }
        content = "abc-dc#e&ppo~dfs0start";
        //分割一个字符串安按照-&~#或者数字来分割
        String[] split = content.split("#|-|&|~|\\d+");
        for (String str : split) {
            System.out.println(str);
        }
    }
}
