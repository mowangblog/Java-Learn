package top.mowangblog.code.map_;

import java.util.Properties;

/**
 * JavaStudy
 * properties
 *
 * @author : Xuan Li
 * @date : 2021-09-11 18:58
 **/
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("1","vaule");
        properties.put("2","vaule");
        System.out.println("properties.getProperty(\"1\") = " + properties.getProperty("1"));
        System.out.println("properties.get(\"1\") = " + properties.get("1"));
        System.out.println(properties.remove("1"));
        System.out.println(properties.put("1",11));
        System.out.println(properties.put("1",121));
    }
}
