package top.mowangblog.code.writer_;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * JavaStudy
 * 字符流文件写入
 *
 * @author : Xuan Li
 * @date : 2021-09-17 22:53
 **/
public class FileWriter01 {

    public void writeFile1(){

    }
    @Test
    public void writeFile2(){
        String filePath = "D:\\hello.txt";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(filePath,true);
            //写入一个字符
//            fileWriter.write('L');
            //可以写入字符数组并规定其实和结束位置，字符串，字符
            fileWriter.write("https://mowangblog.top 魔王の博客".toCharArray(),0,25);
            fileWriter.write("https://mowangblog.top 魔王の博客",0,25);
            fileWriter.write("风雨之后才会见彩虹");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
