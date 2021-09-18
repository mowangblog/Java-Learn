package top.mowangblog.code.io.properties_;

import java.io.FileReader;
import java.util.Properties;

/**
 * JavaStudy
 * 读取配置文件
 *
 * @author : Xuan Li
 * @date : 2021-09-18 21:38
 **/
public class Properties02 {
    public static void main(String[] args) throws Exception {
        //使用properties类来读取
        Properties properties = new Properties();
        //加载配置文件
        properties.load(new FileReader("src/mysql.properties"));
        properties.list(System.out);
        System.out.println("properties.get(\"Username\") = " + properties.get("Username"));
        System.out.println("properties.get(\"Driver\") = " + properties.get("Driver"));
        System.out.println("properties.get(\"Url\") = " + properties.get("Url"));
        System.out.println("properties.get(\"Password\") = " + properties.get("Password"));
    }
}
