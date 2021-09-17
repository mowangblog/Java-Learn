package top.mowangblog.code.outputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JavaStudy
 * 文件拷贝
 *
 * @author : Xuan Li
 * @date : 2021-09-17 22:20
 **/
public class FileCopy {
    public static void main(String[] args) {
        //文件原地址和要拷贝到的地址
        String inFilePath = "D:\\MoWang\\Download\\logo.png";
        String outFilePath = "D:\\logo.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(inFilePath);
            fileOutputStream = new FileOutputStream(outFilePath);
            //一次读取128字节
            byte[] bytes = new byte[128];
            int readLen = 0;
            while ((readLen = fileInputStream.read(bytes)) != -1){
                //写入实际读取的字节
                fileOutputStream.write(bytes,0,readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
