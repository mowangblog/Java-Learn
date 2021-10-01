package top.mowangblog.regexp.work;

/**
 * JavaStudy
 * 验证是否整数或者小数
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-10-01 19:12
 **/
public class exercise02 {
    public static void main(String[] args) {
        //验证是否整数或者小数
        String content = "-01.23";
        if (content.matches("[+-]?([1-9]\\d*|0)(\\.\\d+)?")) {
            System.out.println("符合规则");
        } else {
            System.out.println("不符合规则");
        }
    }
}
