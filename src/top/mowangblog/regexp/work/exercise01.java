package top.mowangblog.regexp.work;

/**
 * JavaStudy
 * 验证电子邮箱格式是否合法
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-10-01 19:12
 **/
public class exercise01 {
    public static void main(String[] args) {
        //要求
        //只有能一个@
        //@前面是用户名可以说a-zA-z0-9_-字符
        //后面是域名并且只能是英文字母
        String content = "mowangblog@qq.com";
        if (content.matches("^[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$")) {
            System.out.println("符合规则");
        } else {
            System.out.println("不符合规则");
        }
    }
}
