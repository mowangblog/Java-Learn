package top.mowangblog.code.io.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * JavaStudy
 * 字符打印流
 *
 * @author : Xuan Li
 * @date : 2021-09-18 21:30
 **/
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("D:/test.txt"));
        printWriter.write("你好世界");
        printWriter.close();
    }
}
