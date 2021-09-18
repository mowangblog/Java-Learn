package top.mowangblog.code.io.outputstream_;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * JavaStudy
 * 文件输出流
 *
 * @author : Xuan Li
 * @date : 2021-09-17 21:55
 **/
public class FileOutputStream_ {

    @Test
    public void write()  {
        String filePath = "D:/hello.txt";
        OutputStream outputStream = null;
        try {
            //FileOutputStream(filePath); 这种创建方式会覆盖掉原文件写入
            //FileOutputStream(filePath,true); 这种创建方式会覆盖掉原文件写入
            outputStream = new FileOutputStream(filePath);
            //写入一个字节
//            outputStream.write('L');
            String str = "魔王博客https://mowangblog.top";
            //写入字节数组，可设置写入的起始和末尾位置
            outputStream.write(str.getBytes(),0,str.length());



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
