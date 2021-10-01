package top.mowangblog.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * JavaStudy
 * 正则表达式语法限定符
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-10-01 09:10
 **/
public class RegExpGrammar1 {
    public static void main(String[] args) {
        //转义符\\
        //需要用到转义符的字符有以下：.*+()$/\?[]^{}
        String content = "12345 abc123";
        //String regStr = "(abc){2}";//出现两次
        //String regStr = "(abc){2,}";//至少出现两次
        //String regStr = "(abc){2,3}";//至少出现两次,最多出现3次
        //String regStr = "[a-z]+";//至少出现一次
        //String regStr = "(\\d)*";//0-无限次
//        String regStr = "abc(123)+";
        //String regStr = "^abc\\d+abc$";//必须是abc开头，abc结尾
        //String regStr = "^\\d+[a-z]*";//以至少一个数字开头，接任意小写字母的字符串
        String regStr = "\\d+\\B";//\\b匹配边界的，大写取反
        Pattern compile = Pattern.compile(regStr/*,Pattern.CASE_INSENSITIVE*/);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println("matcher.group(0) = " + matcher.group(0));
        }
    }
}
