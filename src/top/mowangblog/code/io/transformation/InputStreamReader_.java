package top.mowangblog.code.io.transformation;

import java.io.*;

/**
 * JavaStudy
 * 输入转换字节流设置编码
 *
 * @author : Xuan Li
 * @date : 2021-09-18 20:59
 **/
public class InputStreamReader_ {
    public static void main(String[] args) {
        String filePath = "D:/test.txt";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
