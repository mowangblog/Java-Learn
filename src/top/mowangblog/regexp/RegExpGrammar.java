package top.mowangblog.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * JavaStudy
 * 正则表达式语法
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-10-01 09:10
 **/
public class RegExpGrammar {
    public static void main(String[] args) {
        //转义符\\
        //需要用到转义符的字符有以下：.*+()$/\?[]^{}
        String content = "abc$(ABC$-abc(122344324goods443244443(. \n";
        //如果要匹 . 要写成\\. 不然会全部匹配
        //\\d{3} = \\d\\d\\d
        //?代表0-1代表有可能有有可能没有
        //*代表任意个数
        //w可以匹配数字和大小写字母以及下划线
        //W大写代表取反
        //(?!)不区分大小写
        //[^a-z]不是a-z任意一个字符+
        //[^0-9]不是0-9任意一个字符+
//        String regStr = "\\d{3}(\\d)*";  *代表任意个数
//        String regStr = "\\d{3}(\\d)?";
//        String regStr = "\\d{3}(\\w)*";
//        String regStr = "[a-z]{3}\\$";
//        String regStr = "\\W";
//        String regStr = "\\d+[a-z]";
        String regStr = "\\d+|[a-z]";
        Pattern compile = Pattern.compile(regStr/*,Pattern.CASE_INSENSITIVE*/);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println("matcher.group(0) = " + matcher.group(0));
        }
    }
}
