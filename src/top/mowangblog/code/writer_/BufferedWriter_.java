package top.mowangblog.code.writer_;

import java.io.*;

/**
 * JavaStudy
 * 处理流写入
 *
 * @author : Xuan Li
 * @date : 2021-09-17 23:58
 **/
public class BufferedWriter_ {
    public static void main(String[] args) {
        String filePath = "D:\\hello.txt";
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
            bufferedWriter.write("hello 魔王博客");
            bufferedWriter.newLine();//插入一个和系统相关的换行

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
