package top.mowangblog.code.stringbuffer_;

/**
 * JavaStudy
 * string buffer
 *
 * @author : Xuan Li
 * @date : 2021-09-05 13:28
 **/
public class StringBuffer01 {
    public static void main(String[] args) {
        //继承与AbstractStringBuilder 初始容量16
        StringBuffer stringBuffer = new StringBuffer();

        //指定大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //当前字符串的长度+16 容量22
        StringBuffer stringBuffer2 = new StringBuffer("lixuan");
    }
}
