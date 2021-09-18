package top.mowangblog.code.io.printstream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * JavaStudy
 * 字节打印流
 *
 * @author : Xuan Li
 * @date : 2021-09-18 21:24
 **/
public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream out= System.out;
        out.println("lixuan");
        //底层使用write，因此使用write也可以打印
        out.write("mowang".getBytes());
        out.close();
        //修改打印流输出的位置到d盘的文件
        System.setOut(new PrintStream("D:/test.txt"));
        System.out.println("mowang");
    }
}
