package top.mowangblog.code.inputstream_;

import java.io.*;

/**
 * JavaStudy
 * 处理流拷贝
 *
 * @author : Xuan Li
 * @date : 2021-09-18 00:18
 **/
public class BufferedStreamCopy {
    public static void main(String[] args) {
        String srcFilePath = "D:\\MoWang\\Videos\\Captures\\测试录屏.mp4";
        String destFilePath = "D:\\test.mp4";
        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;
        //字节流可以处理所有文件，包括二进制和文本文件
        try {
            inputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
            outputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));
            byte[] buffer = new byte[1024];
            int readLen = 0;
            while ((readLen = inputStream.read(buffer)) != -1){
                outputStream.write(buffer,0,readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
