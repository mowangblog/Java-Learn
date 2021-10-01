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
public class RegExpExercise3 {
    public static void main(String[] args) {
        //验证URL是否有效
        String content = "https://www.bilibili.com/video/BV1fh411y7R8?p=894";
        String regx = "^((https|http)://)([\\w-]+\\.)+[\\w-]+(\\/[\\w-#&%=?./]*)?$";
        Pattern compile = Pattern.compile(regx);
        Matcher matcher = compile.matcher(content);
        //快速判断整体匹配
        System.out.println(Pattern.matches(regx, content));
        if (matcher.find()) {
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }
    }
}
