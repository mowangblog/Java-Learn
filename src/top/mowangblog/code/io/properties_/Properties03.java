package top.mowangblog.code.io.properties_;

import java.io.FileWriter;
import java.util.Properties;

/**
 * JavaStudy
 * 读取配置文件
 *
 * @author : Xuan Li
 * @date : 2021-09-18 21:38
 **/
public class Properties03 {
    public static void main(String[] args) throws Exception {
        //使用properties类来读取
        Properties properties = new Properties();
        properties.setProperty("Times","100");
        //加载配置文件
        properties.store(new FileWriter("src/mysql2.properties"),null);
    }
}
