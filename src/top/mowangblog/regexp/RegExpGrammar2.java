package top.mowangblog.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * JavaStudy
 * 正则表达式语法分组
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-10-01 09:10
 **/
public class RegExpGrammar2 {
    public static void main(String[] args) {
        //转义符\\
        //需要用到转义符的字符有以下：.*+()$/\?[]^{}
        String content = "Windows7 Windows10 Windows2000";
        //非命名分组
        //String regStr = "(\\d\\d)(\\d\\d)";
        //命名分组可以给组取名
        //String regStr = "(?<g1>\\d\\d)(?<g2>\\d\\d)";
        //非捕获分组不能用group(1)
        //String regStr = "(?:\\d\\d)(?:\\d\\d)";
        //非捕获分组只取前面
        //String regStr = "Windows(?=7|10)";
        //非捕获分组取反只取前面
        //String regStr = "Windows(?!7|10)";
        //非贪婪匹配，限定符后加？表示非贪婪匹配
        String regStr = "Windows\\d+?";
        Pattern compile = Pattern.compile(regStr/*,Pattern.CASE_INSENSITIVE*/);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println("matcher.group(0) = " + matcher.group(0));
//            System.out.println("matcher.group(1) = " + matcher.group(1));
//            System.out.println("matcher.group(2) = " + matcher.group(2));
//            System.out.println("matcher.group(g1) = " + matcher.group("g1"));
//            System.out.println("matcher.group(g2) = " + matcher.group("g2"));
        }
    }
}
