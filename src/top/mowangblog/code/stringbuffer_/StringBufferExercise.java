package top.mowangblog.code.stringbuffer_;

/**
 * JavaStudy
 * Exercise
 *
 * @author : Xuan Li
 * @date : 2021-09-05 13:56
 **/
@SuppressWarnings("all")
public class StringBufferExercise {
    public static void main(String[] args) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        //append如果追加字符串是空则调用appendNull
//        if (str == null)
//        return appendNull();
          //appendNull 里面添加了字符null
//        value[c++] = 'n';
//        value[c++] = 'u';
//        value[c++] = 'l';
//        value[c++] = 'l';
        System.out.println(stringBuffer.length());
        //因此长度为4

        //构造方法里面str.length()+16 会发生空指针异常
        //StringBuffer stringBuffer1 = new StringBuffer(str);
    }
}
