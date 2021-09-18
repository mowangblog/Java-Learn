package top.mowangblog.code.io.transformation;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * JavaStudy
 * 字节转字符输出流
 *
 * @author : Xuan Li
 * @date : 2021-09-18 21:15
 **/
public class OutputStreamWriter_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:/test.txt";
        BufferedWriter bw = null;
        bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath),"utf8"));
        bw.write("mowangblog");
        bw.close();

    }
}
