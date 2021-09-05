package top.mowangblog.code.stringbuffer_;

/**
 * JavaStudy
 * 常见方法demo
 *
 * @author : Xuan Li
 * @date : 2021-09-05 13:35
 **/
public class StringBufferMethod {
    public static void main(String[] args) {
        //1.append 追加
        StringBuffer stringBuffer = new StringBuffer("lixuan");
        stringBuffer.append("mowang").append(111).append(true).append(11.0);
        System.out.println(stringBuffer);

        //2.delete 删除6-12的字符 [6,12)，前闭后开
        stringBuffer.delete(6, 12);
        System.out.println(stringBuffer);

        //3.replace 替换6-9的字符为后面的字符串
        stringBuffer.replace(6, 9, "大魔王");
        System.out.println(stringBuffer);

        //4.indexOf 查询返回子串第一次出现的位置，没有则返回-1
        System.out.println(stringBuffer.indexOf("true"));

        //5.insert 在指定下标插入字符串
        stringBuffer.insert(9,"博客");
        System.out.println(stringBuffer);

        //6.length 返回string buffer的长度
        System.out.println(stringBuffer.length());
    }
}
