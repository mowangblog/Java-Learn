package top.mowangblog.code.string_.work;

/**
 * JavaStudy
 * exercise
 *
 * @author : Xuan Li
 * @date : 2021-09-06 00:26
 **/
public class StringPrintName {
    public static void main(String[] args) {
        printfName("lixuan mowang LiXuan");
    }
    public static void printfName(String str){
        if(str == null){
            System.out.println("不能为空");
            return;
        }
        String[] s = str.split(" ");
        if(s.length != 3){
            System.out.println("长度不对");
            return;
        }
        System.out.println(String.format("%s,%s.%c", s[2], s[1], s[0].charAt(0)));
    }
}
