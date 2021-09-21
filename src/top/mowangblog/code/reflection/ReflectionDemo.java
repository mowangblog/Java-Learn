package top.mowangblog.code.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * JavaStudy
 * 反射
 *
 * @author : Xuan Li
 * @date : 2021-09-21 17:15
 **/
@SuppressWarnings("all")
public class ReflectionDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        String classpath = "";
        String method = "";
        try {
            properties.load(new FileInputStream("src/dog.properties"));
            classpath = (String) properties.get("classpath");
            method = (String) properties.get("method");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Class aClass = Class.forName(classpath);
            Object o = aClass.getDeclaredConstructor().newInstance();
            System.out.println(o.getClass());
            aClass.getMethod(method).invoke(o);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
