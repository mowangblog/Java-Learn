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
public class RegExpExercise5 {
    public static void main(String[] args) {
        //反向引用
        String content = "我要..要要...学学学学..java";
        //结巴去重
        String regx = "\\.";
        Pattern compile = Pattern.compile(regx);
        Matcher matcher = compile.matcher(content);
        //去掉...符号
        content = matcher.replaceAll("");
        compile = Pattern.compile("(.)\\1+");
        matcher = compile.matcher(content);

        //使用一行代码去掉重复的字
        System.out.println(Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1"));
        //把重复的替换为一个自己
        System.out.println(matcher.replaceAll("$1"));
        while (matcher.find()) {
            System.out.println("matcher.group(0) = " + matcher.group(0));
        }
    }
}
