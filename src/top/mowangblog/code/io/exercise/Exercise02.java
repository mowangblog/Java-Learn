package top.mowangblog.code.io.exercise;

import java.io.*;

/**
 * JavaStudy
 * io流练习
 *
 * @author : Xuan Li
 * @date : 2021-09-18 21:58
 **/
public class Exercise02 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/myTemp/hello.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));
        String line;
        int cont = 0;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(++cont + "  "+line);
        }
    }
}
