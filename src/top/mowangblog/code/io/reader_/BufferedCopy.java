package top.mowangblog.code.io.reader_;

import java.io.*;

/**
 * JavaStudy
 * 处理流拷贝
 *
 * @author : Xuan Li
 * @date : 2021-09-18 00:04
 **/
public class BufferedCopy {
    public static void main(String[] args) {
        String srcFilePath = "D:\\hello.txt";
        String destFilePath = "D:\\hello2.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
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
