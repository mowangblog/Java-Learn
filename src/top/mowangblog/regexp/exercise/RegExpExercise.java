package top.mowangblog.regexp.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * JavaStudy
 * 正则表达式案例练习
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-10-01 17:13
 **/
public class RegExpExercise {
    public static void main(String[] args) {
        //验证是否是汉字
        String content = "魔王-博客";
        String regx = "^[\u0391-\uffe5]+$";
        Pattern compile = Pattern.compile(regx);
        Matcher matcher = compile.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }
    }
}
