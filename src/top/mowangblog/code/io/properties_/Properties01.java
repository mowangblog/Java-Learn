package top.mowangblog.code.io.properties_;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * JavaStudy
 * 读取配置文件
 *
 * @author : Xuan Li
 * @date : 2021-09-18 21:38
 **/
public class Properties01 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/mysql.properties"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            String[] split = line.split("=");
            System.out.println(split[0]+":"+split[1]);
        }
        bufferedReader.close();
    }
}
