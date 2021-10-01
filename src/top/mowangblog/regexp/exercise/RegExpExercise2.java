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
public class RegExpExercise2 {
    public static void main(String[] args) {
        String content = "17674090626";
        //验证邮政编码
        //以1-9开头六位数
        //String regx = "^[1-9]\\d{5}$";

        //验证是否是qq号
        //1-9开头，5-10位数
        //String regx = "^[1-9]\\d{4,9}$";

        //验证是否是手机号
        //必须是13,14,15,17,18开头的11位数
        String regx = "^1[3|4|5|7|8]\\d{9}$";
        Pattern compile = Pattern.compile(regx);
        Matcher matcher = compile.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }
    }
}
