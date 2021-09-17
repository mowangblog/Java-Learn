package top.mowangblog.code.reader_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * JavaStudy
 * 处理流读取文本
 *
 * @author : Xuan Li
 * @date : 2021-09-17 23:53
 **/
public class BufferedReader_ {
    public static void main(String[] args) {
        String filePath = "D:\\hello.txt";
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
