package top.mowangblog.code.stringbuffer_;

/**
 * JavaStudy
 * string buffer
 *
 * @author : Xuan Li
 * @date : 2021-09-05 13:28
 **/
@SuppressWarnings("all")
public class StringBuffer02 {
    public static void main(String[] args) {
        //str -> stringBuffer
        String str = "lixuan";
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer = stringBuffer.append("mowang");

        //stringBuffer -> str
        String str2 = stringBuffer.toString();
        String s = new String(stringBuffer);
        System.out.println(s);

    }
}
