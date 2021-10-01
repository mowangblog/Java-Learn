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
public class RegExpExercise4 {
    public static void main(String[] args) {
        //反向引用
        String content = "12211-000999333";
        //1-4位数相同，2-3位数相同
        //String regx = "(\\d)(\\d)\\2\\1";
        //前面是五位数，然后一个-，然后是一个九位数，连续每三位要相同
        String regx = "^\\d{5}-((\\d)\\2{2}){3}$";
        Pattern compile = Pattern.compile(regx);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println("matcher.group(0) = " + matcher.group(0));
        }
    }
}
