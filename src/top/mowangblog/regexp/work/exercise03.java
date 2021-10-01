package top.mowangblog.regexp.work;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * JavaStudy
 * 解析网址，分别获取传输协议，网址，端口号，文件名
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-10-01 20:02
 **/
public class exercise03 {
    public static void main(String[] args) {
        //要求
        String content = "https://mowangblog.top:8080/file/index.html";
        String regStr = "^(https|http)://([\\w.]+):(\\d+)/(?:\\w+/)*([\\w.]+)$";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
            System.out.println(matcher.group(4));
        }
    }
}
