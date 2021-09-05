package top.mowangblog.code.stringbuffer_;

import java.util.Scanner;

/**
 * JavaStudy
 * Exercise
 *
 * @author : Xuan Li
 * @date : 2021-09-05 13:56
 **/
@SuppressWarnings("all")
public class StringBufferWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer stringBuffer2 = new StringBuffer(scanner.next());
        int len = stringBuffer2.lastIndexOf(".");
        for (int i = len-3; i > 0; i-=3) {
            stringBuffer2.insert(i, ",");
        }
        System.out.println(stringBuffer2);
    }
}
